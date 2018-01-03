package com.gotee.security.transfer;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

public class Farmer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Farmer()
	{
		
	}
	
	private String farmerId;
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String fatherName;
	private String motherName;
	private Date dob;
	private Integer mobileNumber;
	private Integer phoneNumber;
	private String maritalStatus;
	private String emailId;
	private String bloodGroup;
	private Long annualIncome;
	private String pancardNo;
	private String voterId;
	private String aadharId;
	private String referenceId;
	private String drivingLicenceId;
	private Date creationDate;
	private Date updationDate;
	private Date lastLoginDate;
	private Educatation educatation;
	public String getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}
	
	
	
	
	public Educatation getEducatation() {
		return educatation;
	}
	public void setEducatation(Educatation educatation) {
		this.educatation = educatation;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(Long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getDrivingLicenceId() {
		return drivingLicenceId;
	}
	public void setDrivingLicenceId(String drivingLicenceId) {
		this.drivingLicenceId = drivingLicenceId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	

}
