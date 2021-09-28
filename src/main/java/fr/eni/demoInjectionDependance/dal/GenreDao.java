package fr.eni.demoInjectionDependance.dal;

import fr.eni.demoInjectionDependance.bo.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreDao extends JpaRepository<Genre, Long> {

}
