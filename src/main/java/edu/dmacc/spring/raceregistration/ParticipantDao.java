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
	public List<Participant> getParticipantId() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select p from Participant p";
		TypedQuery<Participant> typedQuery = em.createQuery(q, Participant.class);
		List<Participant> all = typedQuery.getResultList();
		return all;
	}
	/*public void deleteParticipant(Participant participanttoDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Participant> typedQuery = em.createQuery(
				"select li from Participant li where li.participantId = :selectedId",Participant.class);
		typedQuery.setParameter("selectedId", participanttoDelete.getPartId()); 
		typedQuery.setMaxResults(1);
		Participant result = typedQuery.getSingleResult();
		System.out.println("TEST - result: " + result);
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		
	}	
	
	public Participant searchForParticipantById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		Participant foundItem =  em.find(Participant.class, idToEdit);
		em.close();
		return foundItem; 
	}

	public void editParticipant(Participant toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin(); 
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();*/
	}





