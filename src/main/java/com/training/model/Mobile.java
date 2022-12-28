package com.training.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Autowired
	private Sim sim1;
    private Sim sim2;
	private String activeSim;

	@PostConstruct
	public void makeCall() {
		if(activeSim.equalsIgnoreCase("sim1")) 
			sim1.makeCall();
		else if(activeSim.equalsIgnoreCase("sim2"))
			sim2.makeCall();
		else
			System.out.println("Invalid sim");
	}
	

	public void setActiveSim(String activeSim) {
		this.activeSim="sim";
	}


	public void setSim(@Qualifier("airtel")Sim sim1) {
		this.sim1 = sim1;
	}

//	@Autowired
//	public void setSim2(@Qualifier("jio")Sim sim2) {
//		this.sim2 = sim2;
//	}
}
