package com.cg.billing.daoservice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.billing.beans.Plan;

public class PlanDaoImpl implements PlanDao{
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	

	@Override
	public Plan save(Plan plan) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(plan);
		entityManager.getTransaction().commit();
		entityManager.close();
		return plan;
	}

	@Override
	public boolean update(Plan plan) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(plan);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}

	@Override
	public Plan findOne(int planId) {
		return entityManagerFactory.createEntityManager().find(Plan.class,planId);
	}

	@Override
	public List<Plan> findAll() {
		Query query = entityManagerFactory.createEntityManager().createQuery("from Plan p",Plan.class);
		return (List<Plan>)query.getResultList();
	}

}
