package edu.dmacc.spring.raceregistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class ParticipantDao {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("RaceRegistration");
	
	public void insertParticipant(Participant participantToAdd) {
	EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(participantToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Participant> getAllParticipants() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select p from Participant p";
		TypedQuery<Participant> typedQuery = em.createQuery(q, Participant.class);
		List<Participant> all = typedQuery.getResultList();
				return all;
	}
}

