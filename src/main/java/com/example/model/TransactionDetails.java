package com.example.model;

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.Id; 
import javax.persistence.Table; 


	@Entity 
	@Table(name = "transactiondetails") 
	 public class TransactionDetails { 
	 
	 
	 	@Id 
	 	@Column(name = "id") 
	 	private int id; 
	 
	 
	 	@Column(name = "txn_id") 
	 	private String txnId; 
	 
	 
	 	@Column(name = "dr_account") 
	 	private String drAccount; 
	 
	 
	 	@Column(name = "cr_account") 
	 	private String crAccount; 
	 
	 
	 	@Column(name = "amount") 
	 	private float amount; 
	 
	 
		@Column(name = "txn_type") 
		private String txnType;


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getTxnId() {
			return txnId;
		}


		public void setTxnId(String txnId) {
			this.txnId = txnId;
		}


		public String getDrAccount() {
			return drAccount;
		}


		public void setDrAccount(String drAccount) {
			this.drAccount = drAccount;
		}


		public String getCrAccount() {
			return crAccount;
		}


		public void setCrAccount(String crAccount) {
			this.crAccount = crAccount;
		}


		public float getAmount() {
			return amount;
		}


		public void setAmount(float amount) {
			this.amount = amount;
		}


		public String getTxnType() {
			return txnType;
		}


		public void setTxnType(String txnType) {
			this.txnType = txnType;
		}


		@Override
		public String toString() {
			return "TransactionDetails [id=" + id + ", txnId=" + txnId + ", drAccount=" + drAccount + ", crAccount="
					+ crAccount + ", amount=" + amount + ", txnType=" + txnType + "]";
		} 

}
