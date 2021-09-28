package fr.eni.demoInjectionDependance.converter;

import fr.eni.demoInjectionDependance.dal.GenreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoInjectionDependance.bo.Genre;

@Component
public class GenreConverter implements Converter<String, Genre>{

	private GenreDao genreDao;
	@Autowired
	private void setAvisDao(GenreDao genreDao){
		this.genreDao = genreDao;
	}
	
	@Override
	public Genre convert(String id) {
		Long theid = Long.parseLong(id);
		return genreDao.getById(theid);
	}
}