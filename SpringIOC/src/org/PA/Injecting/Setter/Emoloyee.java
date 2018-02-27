package org.PA.Injecting.Setter;

public class Emoloyee {

	private int id;
	private String name;
	private String address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}

}
