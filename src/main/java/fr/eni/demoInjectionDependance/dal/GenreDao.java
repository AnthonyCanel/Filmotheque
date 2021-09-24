package fr.eni.demoInjectionDependance.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.demoInjectionDependance.bo.Genre;

public interface GenreDao extends JpaRepository<Genre, Long> {

}
