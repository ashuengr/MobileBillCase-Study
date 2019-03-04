package com.cg.billing.daoservice;

import java.util.List;

import com.cg.billing.beans.Plan;

public interface PlanDao {
	Plan save(Plan plan);
	boolean update(Plan plan);
	Plan findOne(int planId);
	List<Plan> findAll();
}
