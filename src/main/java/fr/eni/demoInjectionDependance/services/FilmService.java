package fr.eni.demoInjectionDependance.services;

import java.util.List;

import fr.eni.demoInjectionDependance.bo.Participant;
import fr.eni.demoInjectionDependance.dal.FilmDao;
import fr.eni.demoInjectionDependance.dal.ParticipantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.dal.Repository;

@Service
public class FilmService {

    private FilmDao filmDao;
    @Autowired
    public FilmService(FilmDao filmDao) {
        this.filmDao = filmDao;
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
