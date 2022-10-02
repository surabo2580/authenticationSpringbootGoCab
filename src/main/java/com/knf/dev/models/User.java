package com.knf.dev.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cabuser")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String lastname;
	@Column(unique = true)
	private String username;

//	@Column(unique = true)
	private String email;
	private String password;
	private String phone;
	private String confirmpassword;


	public User(String firstname,String lastname,String username,String email,String password,String phone,String confirmpassword) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.confirmpassword=confirmpassword;




	}
	public User() {
		super();
	}


}
