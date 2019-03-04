package com.cg.billing.beans;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PostpaidAccount {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long mobileNo;
private Plan plan;
private Customer customer;
private Map<Integer,Bill>bills=new HashMap<>();
public PostpaidAccount() {
	super();
}
public PostpaidAccount(long mobileNo, Plan plan, Customer customer, Map<Integer, Bill> bills) {
	super();
	this.mobileNo = mobileNo;
	this.plan = plan;
	this.customer = customer;
	this.bills = bills;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public Plan getPlan() {
	return plan;
}
public void setPlan(Plan plan) {
	this.plan = plan;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Map<Integer, Bill> getBills() {
	return bills;
}
public void setBills(Map<Integer, Bill> bills) {
	this.bills = bills;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bills == null) ? 0 : bills.hashCode());
	result = prime * result + ((customer == null) ? 0 : customer.hashCode());
	result = prime * result + (int) (mobileNo ^ (mobileNo >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PostpaidAccount other = (PostpaidAccount) obj;
	if (bills == null) {
		if (other.bills != null)
			return false;
	} else if (!bills.equals(other.bills))
		return false;
	if (customer == null) {
		if (other.customer != null)
			return false;
	} else if (!customer.equals(other.customer))
		return false;
	if (mobileNo != other.mobileNo)
		return false;
	return true;
}
@Override
public String toString() {
	return "PostpaidAccount [mobileNo=" + mobileNo + ", customer=" + customer + ", bills=" + bills + "]";
}

}
