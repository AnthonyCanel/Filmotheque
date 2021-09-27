package fr.eni.demoInjectionDependance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.dal.Repository;

@Service
@Scope("singleton")
public class FilmService {
	
	@Autowired
	private Repository repository;
	
    public List<Film> getAll() {
        return repository.getListFilm();
    }

    public Film getById(int id) {
        return repository.getListFilm().get(id);
    }
    
    public void add(Film obj) {
        repository.getListFilm().add(obj);
        obj.setId(repository.getListFilm().size());
    }
}
