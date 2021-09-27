package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoInjectionDependance.bo.Genre;
import fr.eni.demoInjectionDependance.dal.Repository;

@Component
public class GenreConverter implements Converter<String, Genre>{
    @Autowired
    private Repository repository;
	
	@Override
	public Genre convert(String id) {
		Integer theid = Integer.parseInt(id);
		return repository.getListGenre().get(theid);
	}
}