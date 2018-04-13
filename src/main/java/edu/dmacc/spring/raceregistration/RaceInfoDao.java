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
	public void deleteRaceInfo(RaceInfo raceInfoToDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<RaceInfo> typedQuery = em.createQuery("select ri from RaceInfo ri where ri.raceInfoId = :selectedId",RaceInfo.class);
		typedQuery.setParameter("selectedId", raceInfoToDelete.getId()); 
		typedQuery.setMaxResults(1);
		RaceInfo result = typedQuery.getSingleResult();
		System.out.println("TEST - result: " + result);
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	public RaceInfo searchForRaceInfoById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		RaceInfo foundItem =  em.find(RaceInfo.class, idToEdit);
		em.close();
		return foundItem; 
	}
	public void editRaceInfo(RaceInfo toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin(); 
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
}
