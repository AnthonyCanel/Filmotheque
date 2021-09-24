package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import fr.eni.demoInjectionDependance.bo.Genre;
import fr.eni.demoInjectionDependance.services.ManagerBllService;

@Component
public class GenreConverter implements Converter<String, Genre>{
    private ManagerBllService<Genre> serviceGenre;
	
	@Autowired
	public void setMetierService(ManagerBllService<Genre> serviceGenre) {
		this.serviceGenre = serviceGenre;
	}
	
	@Override
	public Genre convert(String id) {
		Integer theid = Integer.parseInt(id);
		return serviceGenre.getMap().get(theid);
	}
}