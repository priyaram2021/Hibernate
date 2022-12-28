package com.training.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{
	
	private String activeStatus;
	private long mobileNumber;
	
	public void makeCall() {
		if(activeStatus.equalsIgnoreCase("on"))
			System.out.println("calling...Jio "+mobileNumber);
		else 
			System.out.println("Sim not reachable");
	}

	
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = "on";
	}
	

	public Jio(long mobileNumber) {
		this.mobileNumber=9756442323l; 
	}
}

