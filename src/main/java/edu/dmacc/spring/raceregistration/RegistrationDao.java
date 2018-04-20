package edu.dmacc.spring.raceregistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RegistrationDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("RaceRegistration");

	public void insertRegistration(Registration registrationToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(registrationToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Registration> getAllRegistration() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select r from Registration r";
		TypedQuery<Registration> typedQuery = em.createQuery(q,Registration.class);
		List<Registration> all = typedQuery.getResultList();
		return all;
	}
	public Registration searchForId(int findId) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String p = "select p from Participant  p";
		String r = "select r from RaceInfo r";
		TypedQuery<Participant> typedQuery = em.createQuery(p,Participant.class);
		TypedQuery<RaceInfo> typedQuery1 = em.createQuery(r,RaceInfo.class);
		Registration foundItem =  em.find(Registration.class, findId);
		em.close();

		return foundItem; 
	}
}