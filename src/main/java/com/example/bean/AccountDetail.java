package com.example.bean;

public class AccountDetail {

	private String custName;

	private String accountNo;

	private String accountType;

	private float balance;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountDetail [custName=" + custName + ", accountNo=" + accountNo + ", accountType=" + accountType
				+ ", balance=" + balance + "]";
	}
}
