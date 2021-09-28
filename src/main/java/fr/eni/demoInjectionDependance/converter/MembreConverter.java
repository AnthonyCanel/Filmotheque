package fr.eni.demoInjectionDependance.converter;

import fr.eni.demoInjectionDependance.dal.GenreDao;
import fr.eni.demoInjectionDependance.dal.MembreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoInjectionDependance.bo.Membre;

@Component
public class MembreConverter implements Converter<String, Membre>{

	private MembreDao membreDao;
	@Autowired
	private void setAvisDao(MembreDao membreDao){
		this.membreDao = membreDao;
	}
	
	@Override
	public Membre convert(String id) {
		Long theid = Long.parseLong(id);
		return membreDao.getById(theid);
	}
}