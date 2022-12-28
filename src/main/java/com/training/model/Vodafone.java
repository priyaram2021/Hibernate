package com.training.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vodafone implements Sim{
	
	private String activeStatus;
	private long mobileNumber;
	
	@PostConstruct
	public void makeCall() {
		if(activeStatus.equalsIgnoreCase("on"))
			System.out.println("calling... Vodafone "+mobileNumber);
		else 
			System.out.println("Sim not reachable");
	}
	
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = "on";
	}

	
	public Vodafone(long mobileNumber) {
		this.mobileNumber=9087324245l; 
	}
}
