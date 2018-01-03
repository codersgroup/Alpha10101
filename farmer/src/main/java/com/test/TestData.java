package com.test;

import com.varunasoft.farmer.daoImpl.FarmerDAOImpl;
import com.varunasoft.farmer.domain.FarmersDetails;

public class TestData {

	
	 
	 public static void main(String[] args) {
		FarmerDAOImpl farmerDAOImpl=new FarmerDAOImpl();
		System.out.println(">>>>>>>>>>++++++++++");
		FarmersDetails farmersDetails=farmerDAOImpl.getFarmerDetail("FARMER_101");
		System.out.println(">>>>>>>"+farmersDetails.getAadharId());
		 
	}
	   

}
