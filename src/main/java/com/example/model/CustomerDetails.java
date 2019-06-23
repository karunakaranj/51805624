package com.example.model;

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.Id; 
import javax.persistence.Table; 


	
	@Entity 
	@Table(name="customerdetails") 
	 public class CustomerDetails  { 
		 
		@Id 
	 	@Column(name="id") 
	 	private int id; 
	 	 
	 	@Column(name="user_name") 
	 	private String userName; 
	 	 
	 	@Column(name="account_no") 
	 	private String accountNo; 
	 	 
	 	@Column(name="account_type") 
	 	private String accountType; 
	 	 
	 	@Column(name="balance") 
	 	private float balance; 
	 	 
	 	@Column(name="email_id") 
	 	private String emailId; 
	 	 
	 	@Column(name="phone_no") 
	 	private long phoneNo; 
	 	 
	 	@Column(name="gender") 
	 	private String gender; 
	 
	 	@Column(name="cust_address") 
	 	private String custAddress; 
	 	
	 	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
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

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public long getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCustAddress() {
			return custAddress;
		}

		public void setCustAddress(String custAddress) {
			this.custAddress = custAddress;
		}
	 	
	 	
	 	@Override
		public String toString() {
			return "CustomerDetails [id=" + id + ", userName=" + userName + ", accountNo=" + accountNo
					+ ", accountType=" + accountType + ", balance=" + balance + ", emailId=" + emailId + ", phoneNo="
					+ phoneNo + ", gender=" + gender + ", custAddress=" + custAddress + "]";
		}

}
