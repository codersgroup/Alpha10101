package com.gotee.security.transfer;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.varunasoft.farmer.domain.FarmersDetails;

public class Educatation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String farmerEducationId;
	private String boardUniversity;
	private String farmerEducationLevel;
	
	public String getFarmerEducationId() {
		return farmerEducationId;
	}
	public void setFarmerEducationId(String farmerEducationId) {
		this.farmerEducationId = farmerEducationId;
	}
	public String getBoardUniversity() {
		return boardUniversity;
	}
	public void setBoardUniversity(String boardUniversity) {
		this.boardUniversity = boardUniversity;
	}
	public String getFarmerEducationLevel() {
		return farmerEducationLevel;
	}
	public void setFarmerEducationLevel(String farmerEducationLevel) {
		this.farmerEducationLevel = farmerEducationLevel;
	}
	
	
	
	

}
