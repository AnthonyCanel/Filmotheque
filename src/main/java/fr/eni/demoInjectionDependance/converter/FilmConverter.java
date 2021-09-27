package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.dal.Repository;

@Component
public class FilmConverter implements Converter<String, Film>{

	@Autowired
    private Repository repository;
	
	@Override
	public Film convert(String id) {
		Integer theid = Integer.parseInt(id);
		return repository.getListFilm().get(theid);
	}
}