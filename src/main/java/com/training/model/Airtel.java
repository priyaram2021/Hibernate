package com.training.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {
	
	private String activeStatus;
	private long mobileNumber;
	
	public void makeCall() {
		if(activeStatus.equalsIgnoreCase("on"))
			System.out.println("calling... Airtel "+mobileNumber);
		else 
			System.out.println("Sim not reachable");
	}
	
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = "on";
	}
	
	
	public Airtel(long mobileNumber) {
		this.mobileNumber=8824522105l; 
	}
}
