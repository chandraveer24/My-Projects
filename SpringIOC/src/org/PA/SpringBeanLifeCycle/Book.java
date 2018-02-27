package org.PA.SpringBeanLifeCycle;

public class Book {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init()
	{
		System.out.println("I am in custom init method in Book");
	}
	
	public void destroy()
	{
		System.out.println("Perform something Before book objects removed from the container");
	}
}
