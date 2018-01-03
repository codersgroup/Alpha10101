package com.gotee.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.gotee.security.transfer.Educatation;
import com.gotee.security.transfer.Farmer;
import com.gotee.services.FarmerServices;
import com.varunasoft.farmer.dao.FarmerDAO;
import com.varunasoft.farmer.domain.FarmersDetails;

public class FarmerServicesImpl implements FarmerServices{

	@Autowired
	Farmer farmer;
	@Autowired
	Educatation educatation;
	@Autowired
	FarmerDAO farmerDAO;
	
	public Farmer getFarmer(String farmerId) 
	{
		FarmersDetails farmersDetails= farmerDAO.getFarmerDetail(farmerId);
		
		//Farmer farmer=new Farmer();
		
		//Educatation educatation;
		
		
		educatation.setFarmerEducationId(farmersDetails.getEducationDetails().getFarmerEducationId());
		educatation.setBoardUniversity(farmersDetails.getEducationDetails().getBoardUniversity());
		educatation.setFarmerEducationLevel(farmersDetails.getEducationDetails().getFarmerEducationLevel());
	//	educatation.setFarmersDetailses(farmersDetails.getEducationDetails().getFarmersDetailses());
		
		
		
		farmer.setFarmerId(farmersDetails.getFarmerId());
		
		farmer.setFirstName(farmersDetails.getFirstName());
		farmer.setLastName(farmersDetails.getLastName());
		farmer.setMiddleName(farmersDetails.getMiddleName());
		farmer.setFatherName(farmersDetails.getFatherName());
        farmer.setMotherName(farmersDetails.getMotherName());
        farmer.setDob(farmersDetails.getDob());
        farmer.setMobileNumber(farmersDetails.getMobileNumber());
        farmer.setPhoneNumber(farmersDetails.getPhoneNumber());
        farmer.setMaritalStatus(farmersDetails.getMaritalStatus());
        farmer.setEmailId(farmersDetails.getEmailId());
        farmer.setBloodGroup(farmersDetails.getBloodGroup());
        farmer.setAnnualIncome(farmersDetails.getAnnualIncome());
        farmer.setPancardNo(farmersDetails.getPancardNo());
        farmer.setVoterId(farmersDetails.getVoterId());
        farmer.setAadharId(farmersDetails.getAadharId());
        farmer.setReferenceId(farmersDetails.getReferenceId());
        farmer.setDrivingLicenceId(farmersDetails.getDrivingLicenceId());
        farmer.setCreationDate(farmersDetails.getCreationDate());
        farmer.setUpdationDate(farmersDetails.getUpdationDate());
        farmer.setLastLoginDate(farmersDetails.getLastLoginDate());
        farmer.setEducatation(educatation);
		return farmer;
		
	}

}
