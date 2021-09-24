package fr.eni.demoInjectionDependance.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.demoInjectionDependance.bo.Membre;

public interface MembreDao extends JpaRepository<Membre, Long>{

}
