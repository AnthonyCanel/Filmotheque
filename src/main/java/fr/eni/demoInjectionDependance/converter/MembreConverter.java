package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import fr.eni.demoInjectionDependance.bo.Membre;
import fr.eni.demoInjectionDependance.services.ManagerBllService;

@Component
public class MembreConverter implements Converter<String, Membre>{
    private ManagerBllService<Membre> serviceMembre;
	
	@Autowired
	public void setMetierService(ManagerBllService<Membre> serviceMembre) {
		this.serviceMembre = serviceMembre;
	}
	
	@Override
	public Membre convert(String id) {
		Integer theid = Integer.parseInt(id);
		return serviceMembre.getMap().get(theid);
	}
}