package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;

	@NotBlank(message= "Name field is required!!")
	@Size(min = 2, max = 20, message = "min 2 and max 20 are required")
	private String name;

	@Column(unique = true)
	@NotBlank(message= "E-mail field is required!!")
	private String email;

	// @Column(name="password")
	private String password;

	@Column(name = "description")
	private String desc;

	// @Column(name="active")
	private boolean active;

	// @Column(name="role")
	private String role;

	// @Column(name="image")
	private String imageUrl;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Contact> contacts = new ArrayList<>();

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	 public List<Contact> getContacts() { return contacts; }
	 
	 public void setContacts(List<Contact> contacts) { this.contacts = contacts; }
	 

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + ", desc=" + desc
				+ ", active=" + active + ", role=" + role + ", imageUrl=" + imageUrl + ", contacts=" + contacts + "]";
	}
	
	
	

}
