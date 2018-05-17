package com.plamenti;

public class Client {
	private String name;
	private String address;
	private String contact;

	public void printClientData() {
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.contact);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.isEmpty()){
			System.out.println("Name should have some value");
			System.out.println("Exception");
		}

		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
