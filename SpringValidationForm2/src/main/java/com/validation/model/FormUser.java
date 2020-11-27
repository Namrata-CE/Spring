package com.validation.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class FormUser {

	@NotBlank
	private String name;
	@Email(message = "Please enter a valid e-mail address")
	private String email;
	@Size(min = 8, max = 15)
	private String password;
	@NotBlank
	private String profession;
	@Size(max = 50)
	private String note;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "FormUser [name=" + name + ", email=" + email + ", password=" + password + ", profession=" + profession
				+ ", note=" + note + "]";
	}


}
