package fr.eni.demoInjectionDependance.dal;

import fr.eni.demoInjectionDependance.bo.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmDao extends JpaRepository<Film, Long> {

}
