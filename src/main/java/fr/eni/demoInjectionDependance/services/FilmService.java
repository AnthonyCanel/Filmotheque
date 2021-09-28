package fr.eni.demoInjectionDependance.services;

import java.util.List;

import fr.eni.demoInjectionDependance.bo.Genre;
import fr.eni.demoInjectionDependance.bo.Participant;
import fr.eni.demoInjectionDependance.dal.FilmDao;
import fr.eni.demoInjectionDependance.dal.GenreDao;
import fr.eni.demoInjectionDependance.dal.ParticipantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.dal.Repository;

@Service
public class FilmService {
    Participant archainbaud = new Participant(0, "Wilder", "Billy");
    Participant spielberg = new Participant(1, "Spielberg", "Steven");
    Participant patWelsh = new Participant(2, "Welsh", "Pat");
    Participant henryThomas = new Participant(3, "Thomas", "Henry");
    Participant marylin = new Participant(4, "Monroe", "Marylin");
    Participant tony = new Participant(5, "Curtis", "Tony");
    Participant jack = new Participant(6, "Lemmon", "Jack");
    Participant iti = new Participant(7, "Ti", "i");
    Participant shirley = new Participant(8, "Shirley", "MacLane");

    Genre horreur = new Genre(0, "Horreur");
    Genre comedie = new Genre(1, "Comedie");

    @Autowired
    public FilmService(ParticipantDao participantDao, GenreDao genreDao){
        participantDao.save(archainbaud);
        participantDao.save(spielberg);
        participantDao.save(patWelsh);
        participantDao.save(henryThomas);
        participantDao.save(marylin);

        genreDao.save(horreur);
        genreDao.save(comedie);
    }

    //Injection de filmDao
    private FilmDao filmDao;
    @Autowired
    public void setFilmDao(FilmDao filmDao) {
        this.filmDao = filmDao;
    }
    //Injection de participantDao
    private ParticipantDao participantDao;
    @Autowired
    public void setParticipantDao(ParticipantDao participantDao) {
        this.participantDao = participantDao;
    }

    public List<Film> getAll() {
        return filmDao.findAll();
    }

    public void add(Film film) {
        filmDao.save(film);
    }

    public Film getById(long id){
        return filmDao.getById(id);
    }
}
