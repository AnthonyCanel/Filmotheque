package fr.eni.demoInjectionDependance.dal;

import fr.eni.demoInjectionDependance.bo.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmDao extends JpaRepository<Film, Long> {
    @Query("select f from Film f where f.genre.libelle = ?1")
    List<Film> findByGenre(String libelle);
}
