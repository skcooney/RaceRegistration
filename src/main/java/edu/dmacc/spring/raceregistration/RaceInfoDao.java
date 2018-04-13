package edu.dmacc.spring.raceregistration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class RaceInfoDao {

EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("RaceRegistration");
	
	public void insertRaceInfo(RaceInfo raceInfoToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(raceInfoToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<RaceInfo> getAllRaceInfo() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select r from RaceInfo r";
		TypedQuery<RaceInfo> typedQuery = em.createQuery(q,RaceInfo.class);
		List<RaceInfo> all = typedQuery.getResultList();
		return all;
	}
}
