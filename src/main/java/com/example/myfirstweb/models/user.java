package com.example.myfirstweb.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name="user")
@Table(name="users")
@JsonIgnoreProperties(ignoreUnknown = true)
public class user implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id  ;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String phone;
	@Column
	private String firstname;
	@Column
	private String lastname;
	
	public user() {}
	
	public user(String email, String password, String firstname, String lastname, String phone) {
		
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	

	@Override
	public String toString() {
		return "user [id=" + id + ", email=" + email + ", password=" + password + ", phone=" + phone + ", firstname="
				+ firstname + ", lastname=" + lastname + "]";
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
	
}
