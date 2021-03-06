package com.varunasoft.farmer.domain;
// Generated 2 Jan, 2018 10:00:37 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AccountDetails generated by hbm2java
 */
@Entity
@Table(name = "ACCOUNT_DETAILS", catalog = "DayBase")
public class AccountDetails implements java.io.Serializable {

	private String accountDetailsId;
	private BankDetails bankDetails;
	private FarmersDetails farmersDetails;
	private Long accountNumber;

	public AccountDetails() {
	}

	public AccountDetails(String accountDetailsId) {
		this.accountDetailsId = accountDetailsId;
	}

	public AccountDetails(String accountDetailsId, BankDetails bankDetails, FarmersDetails farmersDetails,
			Long accountNumber) {
		this.accountDetailsId = accountDetailsId;
		this.bankDetails = bankDetails;
		this.farmersDetails = farmersDetails;
		this.accountNumber = accountNumber;
	}

	@Id

	@Column(name = "Account_Details_Id", unique = true, nullable = false, length = 45)
	public String getAccountDetailsId() {
		return this.accountDetailsId;
	}

	public void setAccountDetailsId(String accountDetailsId) {
		this.accountDetailsId = accountDetailsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Bank_Details")
	public BankDetails getBankDetails() {
		return this.bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FARMER_ID")
	public FarmersDetails getFarmersDetails() {
		return this.farmersDetails;
	}

	public void setFarmersDetails(FarmersDetails farmersDetails) {
		this.farmersDetails = farmersDetails;
	}

	@Column(name = "Account_Number")
	public Long getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

}
