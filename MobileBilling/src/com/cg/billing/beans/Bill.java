package com.cg.billing.beans;

public class Bill {
private int billID;
private int noOfLocalSMS,noOfStdSMS,noOfLocalCalls,noOfStdCalls,internetDataUsageUnits;
private String billMonth;
private double  totalBillAmount,localSMSAmount,stdSMSAmount,localCallAmount,stdCallAmount,internetDataUsageAmount,stateGST,centralGST;
public Bill() {
	super();
}
public Bill(int billID, int noOfLocalSMS, int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls,
		int internetDataUsageUnits, String billMonth, double totalBillAmount, double localSMSAmount, double stdSMSAmount,
		double localCallAmount, double stdCallAmount, double internetDataUsageAmount, double stateGST, double centralGST) {
	super();
	this.billID = billID;
	this.noOfLocalSMS = noOfLocalSMS;
	this.noOfStdSMS = noOfStdSMS;
	this.noOfLocalCalls = noOfLocalCalls;
	this.noOfStdCalls = noOfStdCalls;
	this.internetDataUsageUnits = internetDataUsageUnits;
	this.billMonth = billMonth;
	this.totalBillAmount = totalBillAmount;
	this.localSMSAmount = localSMSAmount;
	this.stdSMSAmount = stdSMSAmount;
	this.localCallAmount = localCallAmount;
	this.stdCallAmount = stdCallAmount;
	this.internetDataUsageAmount = internetDataUsageAmount;
	this.stateGST = stateGST;
	this.centralGST = centralGST;
}
public Bill(int noOfLocalSMS, int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls, int internetDataUsageUnits,
		String billMonth, double totalBillAfterTaxes, double costOfLocalSms, double costOfStdSms,
		double costOfLocalCalls, double costOfStdCalls, double costOfDataUsage, double sgst, double cgst) {
	
	this.noOfLocalSMS = noOfLocalSMS;
	this.noOfStdSMS = noOfStdSMS;
	this.noOfLocalCalls = noOfLocalCalls;
	this.noOfStdCalls = noOfStdCalls;
	this.internetDataUsageUnits = internetDataUsageUnits;
	this.billMonth = billMonth;
	this.totalBillAmount = totalBillAfterTaxes;
	this.localSMSAmount = costOfLocalSms;
	this.stdSMSAmount = costOfStdSms;
	this.localCallAmount = costOfLocalCalls;
	this.stdCallAmount = costOfStdCalls;
	this.internetDataUsageAmount = costOfDataUsage;
	this.stateGST = sgst;
	this.centralGST = cgst;
}
public int getBillID() {
	return billID;
}
public void setBillID(int billID) {
	this.billID = billID;
}
public int getNoOfLocalSMS() {
	return noOfLocalSMS;
}
public void setNoOfLocalSMS(int noOfLocalSMS) {
	this.noOfLocalSMS = noOfLocalSMS;
}
public int getNoOfStdSMS() {
	return noOfStdSMS;
}
public void setNoOfStdSMS(int noOfStdSMS) {
	this.noOfStdSMS = noOfStdSMS;
}
public int getNoOfLocalCalls() {
	return noOfLocalCalls;
}
public void setNoOfLocalCalls(int noOfLocalCalls) {
	this.noOfLocalCalls = noOfLocalCalls;
}
public int getNoOfStdCalls() {
	return noOfStdCalls;
}
public void setNoOfStdCalls(int noOfStdCalls) {
	this.noOfStdCalls = noOfStdCalls;
}
public int getInternetDataUsageUnits() {
	return internetDataUsageUnits;
}
public void setInternetDataUsageUnits(int internetDataUsageUnits) {
	this.internetDataUsageUnits = internetDataUsageUnits;
}
public String getBillMonth() {
	return billMonth;
}
public void setBillMonth(String billMonth) {
	this.billMonth = billMonth;
}
public double getTotalBillAmount() {
	return totalBillAmount;
}
public void setTotalBillAmount(double totalBillAmount) {
	this.totalBillAmount = totalBillAmount;
}
public double getLocalSMSAmount() {
	return localSMSAmount;
}
public void setLocalSMSAmount(double localSMSAmount) {
	this.localSMSAmount = localSMSAmount;
}
public double getStdSMSAmount() {
	return stdSMSAmount;
}
public void setStdSMSAmount(double stdSMSAmount) {
	this.stdSMSAmount = stdSMSAmount;
}
public double getLocalCallAmount() {
	return localCallAmount;
}
public void setLocalCallAmount(double localCallAmount) {
	this.localCallAmount = localCallAmount;
}
public double getStdCallAmount() {
	return stdCallAmount;
}
public void setStdCallAmount(double stdCallAmount) {
	this.stdCallAmount = stdCallAmount;
}
public double getInternetDataUsageAmount() {
	return internetDataUsageAmount;
}
public void setInternetDataUsageAmount(double internetDataUsageAmount) {
	this.internetDataUsageAmount = internetDataUsageAmount;
}
public double getStateGST() {
	return stateGST;
}
public void setStateGST(double stateGST) {
	this.stateGST = stateGST;
}
public double getCentralGST() {
	return centralGST;
}
public void setCentralGST(double centralGST) {
	this.centralGST = centralGST;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + billID;
	result = prime * result + ((billMonth == null) ? 0 : billMonth.hashCode());
	long temp;
	temp = Double.doubleToLongBits(centralGST);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(internetDataUsageAmount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + internetDataUsageUnits;
	temp = Double.doubleToLongBits(localCallAmount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(localSMSAmount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + noOfLocalCalls;
	result = prime * result + noOfLocalSMS;
	result = prime * result + noOfStdCalls;
	result = prime * result + noOfStdSMS;
	temp = Double.doubleToLongBits(stateGST);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(stdCallAmount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(stdSMSAmount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(totalBillAmount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Bill other = (Bill) obj;
	if (billID != other.billID)
		return false;
	if (billMonth == null) {
		if (other.billMonth != null)
			return false;
	} else if (!billMonth.equals(other.billMonth))
		return false;
	if (Double.doubleToLongBits(centralGST) != Double.doubleToLongBits(other.centralGST))
		return false;
	if (Double.doubleToLongBits(internetDataUsageAmount) != Double.doubleToLongBits(other.internetDataUsageAmount))
		return false;
	if (internetDataUsageUnits != other.internetDataUsageUnits)
		return false;
	if (Double.doubleToLongBits(localCallAmount) != Double.doubleToLongBits(other.localCallAmount))
		return false;
	if (Double.doubleToLongBits(localSMSAmount) != Double.doubleToLongBits(other.localSMSAmount))
		return false;
	if (noOfLocalCalls != other.noOfLocalCalls)
		return false;
	if (noOfLocalSMS != other.noOfLocalSMS)
		return false;
	if (noOfStdCalls != other.noOfStdCalls)
		return false;
	if (noOfStdSMS != other.noOfStdSMS)
		return false;
	if (Double.doubleToLongBits(stateGST) != Double.doubleToLongBits(other.stateGST))
		return false;
	if (Double.doubleToLongBits(stdCallAmount) != Double.doubleToLongBits(other.stdCallAmount))
		return false;
	if (Double.doubleToLongBits(stdSMSAmount) != Double.doubleToLongBits(other.stdSMSAmount))
		return false;
	if (Double.doubleToLongBits(totalBillAmount) != Double.doubleToLongBits(other.totalBillAmount))
		return false;
	return true;
}
@Override
public String toString() {
	return "Bill [billID=" + billID + ", noOfLocalSMS=" + noOfLocalSMS + ", noOfStdSMS=" + noOfStdSMS
			+ ", noOfLocalCalls=" + noOfLocalCalls + ", noOfStdCalls=" + noOfStdCalls + ", internetDataUsageUnits="
			+ internetDataUsageUnits + ", billMonth=" + billMonth + ", totalBillAmount=" + totalBillAmount
			+ ", localSMSAmount=" + localSMSAmount + ", stdSMSAmount=" + stdSMSAmount + ", localCallAmount="
			+ localCallAmount + ", stdCallAmount=" + stdCallAmount + ", internetDataUsageAmount="
			+ internetDataUsageAmount + ", stateGST=" + stateGST + ", centralGST=" + centralGST + "]";
}

}
