package fr.eni.demoInjectionDependance.dal;

import fr.eni.demoInjectionDependance.bo.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantDao extends JpaRepository<Participant, Long> {

}
