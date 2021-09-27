package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoInjectionDependance.bo.Participant;
import fr.eni.demoInjectionDependance.dal.Repository;

@Component
public class ParticipantConverter implements Converter<String, Participant>{
    @Autowired
    private Repository repository;
	
	@Override
	public Participant convert(String id) {
		Integer theid = Integer.parseInt(id);
		return repository.getListParticipant().get(theid);
	}
}