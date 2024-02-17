package com.burzynski.swimmingPool;

import java.util.Date;
import java.util.List;

public class Attraction {
	 private String location;
	 private int ageLimitLower; 
	 private int ageLimitUpper;
	 private List<String> healthRestrictions; 
	 private List<String> requiredEquippment;
	 private Date serviceDate;
	 private boolean state; // 1 - available, 0 do not use 
	 
	 //constructors 
	 
	 public Attraction() { 
	 }
	 
	 public Attraction(String location, Date serviceDate, boolean state) {
			this.location = location;
			this.serviceDate = serviceDate;
			this.state = state;
		}
	 
	 public Attraction(String location, int ageLimitLower, int ageLimitUpper, List<String> healthRestrictions,
			List<String> requiredEquippment, Date serviceDate, boolean state) {
		this.location = location;
		this.ageLimitLower = ageLimitLower;
		this.ageLimitUpper = ageLimitUpper;
		this.healthRestrictions = healthRestrictions;
		this.requiredEquippment = requiredEquippment;
		this.serviceDate = serviceDate;
		this.state = state;
	}

	//getters setters 
	 
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAgeLimitLower() {
		return ageLimitLower;
	}
	public void setAgeLimitLower(int ageLimitLower) {
		this.ageLimitLower = ageLimitLower;
	}
	public int getAgeLimitUpper() {
		return ageLimitUpper;
	}
	public void setAgeLimitUpper(int ageLimitUpper) {
		this.ageLimitUpper = ageLimitUpper;
	}
	public List<String> getHealthRestrictions() {
		return healthRestrictions;
	}
	public void setHealthRestrictions(List<String> healthRestrictions) {
		this.healthRestrictions = healthRestrictions;
	}
	public List<String> getRequiredEquippment() {
		return requiredEquippment;
	}
	public void setRequiredEquippment(List<String> requiredEquippment) {
		this.requiredEquippment = requiredEquippment;
	}
	public Date getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	 
	//methods 
	
	 
	 
	 
}
