package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

import fr.eni.demoInjectionDependance.bo.Avis;
import fr.eni.demoInjectionDependance.dal.Repository;

@Component
public class AvisConverter implements Converter<String, Avis>{
    @Autowired
    private Repository repository;
	
	@Override
	public Avis convert(String id) {
		Integer theid = Integer.parseInt(id);
		return repository.getListAvis().get(theid);
	}

	@Override
	public JavaType getInputType(TypeFactory typeFactory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaType getOutputType(TypeFactory typeFactory) {
		// TODO Auto-generated method stub
		return null;
	}
}
