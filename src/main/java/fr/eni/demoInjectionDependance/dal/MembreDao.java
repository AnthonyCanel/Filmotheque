package fr.eni.demoInjectionDependance.dal;

import fr.eni.demoInjectionDependance.bo.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreDao extends JpaRepository<Membre, Long> {

}
