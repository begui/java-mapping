package com.mapping.bean;

public class AddressDto {
	
	private String streetLine; // block street city state zip
	private String street;
	private String block;
	private String city; 
	private String state; 
	private Integer zip;
	private boolean isPrimary;
	
	public String getStreetLine() {
		return streetLine;
	}
	public void setStreetLine(String streetLine) {
		this.streetLine = streetLine;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public boolean isPrimary() {
		return isPrimary;
	}
	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

}
