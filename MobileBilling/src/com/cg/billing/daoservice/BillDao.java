package com.cg.billing.daoservice;

import java.util.List;

import com.cg.billing.beans.Bill;
public interface BillDao {
	Bill save(Bill bill);
	 boolean update (Bill bill);
	 Bill findOne(int billId);
	 List<Bill>findAll();
}
