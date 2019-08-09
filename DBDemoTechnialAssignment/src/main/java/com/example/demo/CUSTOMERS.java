package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CUSTOMERS 
{
	@Id
	private String EmailID;
	private String FirstName;
	private String LastName;
	private long PhoneNumber;
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	

}
