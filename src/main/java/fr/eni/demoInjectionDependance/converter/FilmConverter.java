package fr.eni.demoInjectionDependance.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.services.ManagerBllService;

@Component
public class FilmConverter implements Converter<String, Film>{
    private ManagerBllService<Film> serviceFilm;
	
	@Autowired
	public void setMetierService(ManagerBllService<Film> serviceFilm) {
		this.serviceFilm = serviceFilm;
	}
	
	@Override
	public Film convert(String id) {
		Integer theid = Integer.parseInt(id);
		return serviceFilm.getMap().get(theid);
	}
}