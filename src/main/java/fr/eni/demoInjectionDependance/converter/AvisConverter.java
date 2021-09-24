package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import fr.eni.demoInjectionDependance.bo.Avis;
import fr.eni.demoInjectionDependance.services.ManagerBllService;

@Component
public class AvisConverter implements Converter<String, Avis>{
    private ManagerBllService<Avis> serviceAvis;
	
	@Autowired
	public void setMetierService(ManagerBllService<Avis> serviceAvis) {
		this.serviceAvis = serviceAvis;
	}
	
	@Override
	public Avis convert(String id) {
		Integer theid = Integer.parseInt(id);
		return serviceAvis.getMap().get(theid);
	}
}
