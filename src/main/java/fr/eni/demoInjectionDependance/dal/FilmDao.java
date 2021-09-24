package fr.eni.demoInjectionDependance.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.demoInjectionDependance.bo.Film;

public interface FilmDao extends JpaRepository<Film, Long>{

}
