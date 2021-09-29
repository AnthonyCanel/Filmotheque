package fr.eni.demoInjectionDependance.converter;

import fr.eni.demoInjectionDependance.dal.ParticipantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demoInjectionDependance.bo.Participant;

@Component
public class ParticipantConverter implements Converter<String, Participant>{

	private ParticipantDao participantDao;
	@Autowired
	private void setAvisDao(ParticipantDao participantDao){
		this.participantDao = participantDao;
	}
	
	@Override
	public Participant convert(String id) {
		System.out.println(id);
		Long theid = Long.parseLong(id);
		return participantDao.getById(theid);
	}
}