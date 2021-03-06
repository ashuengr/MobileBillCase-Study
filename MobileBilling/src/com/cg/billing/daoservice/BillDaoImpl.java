package com.cg.billing.daoservice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.billing.beans.Bill;

public class BillDaoImpl implements BillDao{
private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	
	@Override
	public Bill save(Bill bill) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(bill);
		entityManager.getTransaction().commit();
		entityManager.close();
		return bill;

	}

	@Override
	public boolean update(Bill bill) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(bill);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}

	@Override
	public Bill findOne(int billId) {
		return entityManagerFactory.createEntityManager().find(Bill.class,billId);
	}

	@Override
	public List<Bill> findAll() {
		Query query = entityManagerFactory.createEntityManager().createQuery("from Bill b",Bill.class);
		return query.getResultList();
	}

}
