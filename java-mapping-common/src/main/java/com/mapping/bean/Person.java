package com.mapping.bean;

import java.math.BigInteger;
import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private Integer age;
	private List<BigInteger> phoneNumbers;
	private List<Address> addresses;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<BigInteger> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<BigInteger> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
}
