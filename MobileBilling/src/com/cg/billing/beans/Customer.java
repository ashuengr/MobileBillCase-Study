package com.cg.billing.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
private int customerId;
private String firstName,lastName,emailId,dateOfBirth;
private List<Address>address;
private Map<Long,PostpaidAccount>postpaidAccounts=new HashMap<>();
public Customer() {
	super();
}
public Customer(int customerId, String firstName, String lastName, String emailId, String dateOfBirth,
		List<Address> address, Map<Long, PostpaidAccount> postpaidAccounts) {
	super();
	this.customerId = customerId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.dateOfBirth = dateOfBirth;
	this.address = address;
	this.postpaidAccounts = postpaidAccounts;
}

public Customer(String firstName, String lastName, String emailId, String dateOfBirth, ArrayList<Address> address,
		HashMap<Long, PostpaidAccount> postpaidAccounts) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.dateOfBirth = dateOfBirth;
	this.address = address;
	this.postpaidAccounts = postpaidAccounts;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}
public Map<Long, PostpaidAccount> getPostpaidAccounts() {
	return postpaidAccounts;
}
public void setPostpaidAccounts(Map<Long, PostpaidAccount> postpaidAccounts) {
	this.postpaidAccounts = postpaidAccounts;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + customerId;
	result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
	result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
	Customer other = (Customer) obj;
	if (customerId != other.customerId)
		return false;
	if (dateOfBirth == null) {
		if (other.dateOfBirth != null)
			return false;
	} else if (!dateOfBirth.equals(other.dateOfBirth))
		return false;
	if (emailId == null) {
		if (other.emailId != null)
			return false;
	} else if (!emailId.equals(other.emailId))
		return false;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	if (lastName == null) {
		if (other.lastName != null)
			return false;
	} else if (!lastName.equals(other.lastName))
		return false;
	return true;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
			+ emailId + ", dateOfBirth=" + dateOfBirth + "]";
}

}
