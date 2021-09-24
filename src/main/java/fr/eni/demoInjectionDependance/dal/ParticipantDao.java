package fr.eni.demoInjectionDependance.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.demoInjectionDependance.bo.Participant;

public interface ParticipantDao extends JpaRepository<Participant, Long> {

}
