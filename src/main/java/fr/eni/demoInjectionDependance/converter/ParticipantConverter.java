package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import fr.eni.demoInjectionDependance.bo.Participant;
import fr.eni.demoInjectionDependance.services.ManagerBllService;

@Component
public class ParticipantConverter implements Converter<String, Participant>{
    private ManagerBllService<Participant> serviceParticipant;
	
	@Autowired
	public void setMetierService(ManagerBllService<Participant> serviceParticipant) {
		this.serviceParticipant = serviceParticipant;
	}
	
	@Override
	public Participant convert(String id) {
		Integer theid = Integer.parseInt(id);
		return serviceParticipant.getMap().get(theid);
	}
}
