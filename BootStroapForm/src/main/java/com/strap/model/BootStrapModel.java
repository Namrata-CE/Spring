package com.strap.model;

public class BootStrapModel {

	private int id;
	private String FirstName;
	private String LastName;
	private String inputAddress;
	private String inputCity;
	private String inputState;
	private String inputZip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getInputAddress() {
		return inputAddress;
	}
	public void setInputAddress(String inputAddress) {
		this.inputAddress = inputAddress;
	}
	public String getInputCity() {
		return inputCity;
	}
	public void setInputCity(String inputCity) {
		this.inputCity = inputCity;
	}
	public String getInputState() {
		return inputState;
	}
	public void setInputState(String inputState) {
		this.inputState = inputState;
	}
	public String getInputZip() {
		return inputZip;
	}
	public void setInputZip(String inputZip) {
		this.inputZip = inputZip;
	}
	@Override
	public String toString() {
		return "BootStrapModel [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", inputAddress="
				+ inputAddress + ", inputCity=" + inputCity + ", inputState=" + inputState + ", inputZip=" + inputZip
				+ "]";
	}
	
	
	
}
