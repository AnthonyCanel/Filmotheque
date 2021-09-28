package fr.eni.demoInjectionDependance.converter;

import fr.eni.demoInjectionDependance.dal.AvisDao;
import fr.eni.demoInjectionDependance.dal.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.dal.Repository;

@Component
public class FilmConverter implements Converter<String, Film>{

	private FilmDao filmDao;
	@Autowired
	private void setAvisDao(FilmDao filmDao){
		this.filmDao = filmDao;
	}
	
	@Override
	public Film convert(String id) {
		Long theid = Long.parseLong(id);
		return filmDao.getById(theid);
	}
}