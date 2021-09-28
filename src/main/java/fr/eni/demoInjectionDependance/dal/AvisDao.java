package fr.eni.demoInjectionDependance.dal;

import fr.eni.demoInjectionDependance.bo.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisDao extends JpaRepository<Avis, Long> {

}
