package org.PA.Collections;

import java.util.List;

public class Restaurant {

	//Displaying names of all all waiters
	
	@SuppressWarnings("rawtypes")
	private List waiters;

	@SuppressWarnings("rawtypes")
	public void setWaiters(List waiters) {
		this.waiters = waiters;
	}
	
	public void display()
	{
		System.out.println(waiters);
	}
}
