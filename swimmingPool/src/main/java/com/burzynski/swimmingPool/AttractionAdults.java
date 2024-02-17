package com.burzynski.swimmingPool;

import java.util.Date;
import java.util.List;

public class AttractionAdults extends Attraction{

	private final static int AGE_ADULT = 16;
	
	//constructors 
	
	public AttractionAdults() {
		this.setAgeLimitLower(AGE_ADULT);
	}
	
	public AttractionAdults(String location, Date serviceDate, boolean state) {
		this.setLocation(location);
		this.setServiceDate(serviceDate);
		this.setState(state);
		this.setAgeLimitLower(18);
	}
	
	public AttractionAdults(String location, List<String> healthRestrictions,
			List<String> requiredEquippment, Date serviceDate, boolean state) {
		this.setLocation(location);
		this.setAgeLimitLower(18);
		this.setHealthRestrictions(healthRestrictions);
		this.setRequiredEquippment(requiredEquippment);
		this.setServiceDate(serviceDate);
		this.setState(state);
	}
	
	//methods 
	
	public void setLocation(String location) {
		if (location.equals("Over18") || location.equals("sauna")){ 
			this.setLocation(location);}
		else {
			System.out.println("Please choose proper location for adults only attraction");
		};
	}
	
}


