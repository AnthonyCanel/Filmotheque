package fr.eni.demoInjectionDependance.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.demoInjectionDependance.bo.Avis;

public interface AvisDao extends JpaRepository<Avis, Long> {

}
