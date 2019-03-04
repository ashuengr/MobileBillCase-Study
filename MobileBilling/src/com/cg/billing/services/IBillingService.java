package com.cg.billing.services;

import java.util.List;

import com.cg.billing.beans.Bill;
import com.cg.billing.beans.Customer;
import com.cg.billing.beans.Plan;
import com.cg.billing.beans.PostpaidAccount;
import com.cg.billing.exceptions.BillDetailsNotFoundException;
import com.cg.billing.exceptions.CustomerDetailsNotFoundException;
import com.cg.billing.exceptions.InvalidBillMonthException;
import com.cg.billing.exceptions.PlanDetailsNotFoundException;
import com.cg.billing.exceptions.PostpaidAccountNotFoundException;

public interface IBillingService {
List<Plan> getPlanAllDetails();
	
	int acceptCustomerDetails(String firstName, String lastName, String emailID, String dateOfBirth, String billingAddressCity, String billingAddressState, int billingAddressPinCode, String homeAddressCity, String homeAddressState, int homeAddressPinCode);

	long openPostpaidMobileAccount(int customerId, int planId) 
			throws PlanDetailsNotFoundException,CustomerDetailsNotFoundException;
	
	double  generateMonthlyMobileBill(int customerId, long mobileNo, String billMonth, int noOfLocalSMS, int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls,int internetDataUsageUnits) 
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, 
			InvalidBillMonthException;
	
	Customer getCustomerDetails(int customerId)
			throws CustomerDetailsNotFoundException;
	
	List<Customer>  getAllCustomerDetails() ;
	
	PostpaidAccount getPostPaidAccountDetails(int customerId, long mobileNo) 
			throws CustomerDetailsNotFoundException, 
			PostpaidAccountNotFoundException;
	
	List<PostpaidAccount> getCustomerAllPostpaidAccountsDetails(int customerId)
			throws CustomerDetailsNotFoundException;
	
	Bill getMobileBillDetails(int customerId, long mobileNo, String billMonth)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException, 
			InvalidBillMonthException, BillDetailsNotFoundException;
	
	List<Bill>   getCustomerPostPaidAccountAllBillDetails(int customerId, long mobileNo) 
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException;
	
	boolean changePlan(int customerID, long mobileNo, int planID)
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException;
	
	boolean closeCustomerPostPaidAccount(int customerId, long mobileNo) 
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException;
	
	boolean removeCustomerDetails(int customerId) 
			throws CustomerDetailsNotFoundException;
	
	Plan getCustomerPostPaidAccountPlanDetails(int customerId, long mobileNo) 
			throws CustomerDetailsNotFoundException, PostpaidAccountNotFoundException,PlanDetailsNotFoundException ;
}
