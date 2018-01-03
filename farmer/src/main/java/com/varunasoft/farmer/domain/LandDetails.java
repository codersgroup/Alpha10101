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
 * LandDetails generated by hbm2java
 */
@Entity
@Table(name = "LAND_DETAILS", catalog = "DayBase")
public class LandDetails implements java.io.Serializable {

	private String landId;
	private FarmersDetails farmersDetails;
	private String size;
	private String location;

	public LandDetails() {
	}

	public LandDetails(String landId) {
		this.landId = landId;
	}

	public LandDetails(String landId, FarmersDetails farmersDetails, String size, String location) {
		this.landId = landId;
		this.farmersDetails = farmersDetails;
		this.size = size;
		this.location = location;
	}

	@Id

	@Column(name = "LAND_ID", unique = true, nullable = false, length = 45)
	public String getLandId() {
		return this.landId;
	}

	public void setLandId(String landId) {
		this.landId = landId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FARMER_ID")
	public FarmersDetails getFarmersDetails() {
		return this.farmersDetails;
	}

	public void setFarmersDetails(FarmersDetails farmersDetails) {
		this.farmersDetails = farmersDetails;
	}

	@Column(name = "SIZE", length = 100)
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "LOCATION", length = 300)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}