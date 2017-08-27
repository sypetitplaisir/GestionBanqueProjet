package com.formatioin.gbp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.formation.gbp.entity.Client;

public class ClientDAO {
	
	private EntityManager em;
	private EntityTransaction tx;
	
	public ClientDAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_GBP");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	public void addClient (Client c) {
		tx.begin();
		em.persist(c);
		tx.commit();
	}
}
