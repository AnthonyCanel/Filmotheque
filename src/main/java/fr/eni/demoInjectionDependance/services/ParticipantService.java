package fr.eni.demoInjectionDependance.services;

import fr.eni.demoInjectionDependance.bo.Participant;
import fr.eni.demoInjectionDependance.dal.ParticipantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    //Injection de d�pendance de la DAO dans le service
    //La DAO expose les services create read update delete de base
    //Le service sert � manipuler les syst�mes de bases de donn�es
    //Diff�rentes impl�mentations permettraient par exemple de manipuler du JDBC / JPC / ROOM etc...
    //La couche DAO serait directement le syst�me de gestion de la base.
    //      JDBC => on fait toutes les requ�tes � la main
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
