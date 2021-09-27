package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoInjectionDependance.bo.Membre;
import fr.eni.demoInjectionDependance.dal.Repository;

@Component
public class MembreConverter implements Converter<String, Membre>{
    @Autowired
    private Repository repository;
	
	@Override
	public Membre convert(String id) {
		Integer theid = Integer.parseInt(id);
		return repository.getListMembre().get(theid);
	}
}