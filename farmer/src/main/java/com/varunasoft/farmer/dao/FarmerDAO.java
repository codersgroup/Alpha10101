package com.varunasoft.farmer.dao;

import java.util.List;

import com.varunasoft.farmer.domain.FarmersDetails;

public interface FarmerDAO
{
	public void saveFarmerDetail();
	public FarmersDetails getFarmerDetail(String farmerId);
	public List<FarmersDetails> AllFarmerDetails();
	public void updateFarmerDetails();

}
