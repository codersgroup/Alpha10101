package com.varunasoft.farmer.domain;
// Generated 2 Jan, 2018 10:00:37 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BankDetails generated by hbm2java
 */
@Entity
@Table(name = "BANK_DETAILS", catalog = "DayBase")
public class BankDetails implements java.io.Serializable {

	private String bankDetailsId;
	private String state;
	private String bank;
	private String branch;
	private String address;
	private String contact;
	private String city;
	private String district;
	private Long microCode;
	private Set<AccountDetails> accountDetailses = new HashSet<AccountDetails>(0);

	public BankDetails() {
	}

	public BankDetails(String bankDetailsId) {
		this.bankDetailsId = bankDetailsId;
	}

	public BankDetails(String bankDetailsId, String state, String bank, String branch, String address, String contact,
			String city, String district, Long microCode, Set<AccountDetails> accountDetailses) {
		this.bankDetailsId = bankDetailsId;
		this.state = state;
		this.bank = bank;
		this.branch = branch;
		this.address = address;
		this.contact = contact;
		this.city = city;
		this.district = district;
		this.microCode = microCode;
		this.accountDetailses = accountDetailses;
	}

	@Id

	@Column(name = "BankDetails_ID", unique = true, nullable = false, length = 45)
	public String getBankDetailsId() {
		return this.bankDetailsId;
	}

	public void setBankDetailsId(String bankDetailsId) {
		this.bankDetailsId = bankDetailsId;
	}

	@Column(name = "State", length = 45)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "Bank", length = 45)
	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Column(name = "Branch", length = 45)
	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Column(name = "Address", length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "Contact", length = 500)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "City", length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "District", length = 45)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "MicroCode")
	public Long getMicroCode() {
		return this.microCode;
	}

	public void setMicroCode(Long microCode) {
		this.microCode = microCode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bankDetails")
	public Set<AccountDetails> getAccountDetailses() {
		return this.accountDetailses;
	}

	public void setAccountDetailses(Set<AccountDetails> accountDetailses) {
		this.accountDetailses = accountDetailses;
	}

}