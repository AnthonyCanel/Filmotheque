package fr.eni.demoInjectionDependance.services;

import fr.eni.demoInjectionDependance.bo.Participant;
import fr.eni.demoInjectionDependance.dal.ParticipantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    //Injection de dépendance de la DAO dans le service
    //La DAO expose les services create read update delete de base
    //Le service sert à manipuler les systèmes de bases de données
    //Différentes implémentations permettraient par exemple de manipuler du JDBC / JPC / ROOM etc...
    //La couche DAO serait directement le système de gestion de la base.
    //      JDBC => on fait toutes les requêtes à la main
    //      JPA => les annotations
    //      ROOM => d'autres annotations
    private ParticipantDao participantDao;
    @Autowired
    public ParticipantService(ParticipantDao participantDao) {
        this.participantDao = participantDao;
    }

    public List<Participant> getAll() {
        return participantDao.findAll();
    }

    public void ajoutPersonne(Participant participant) {
        participantDao.save(participant);
    }
}
