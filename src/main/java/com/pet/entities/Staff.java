package com.pet.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
	
	@Id
	int staffid;
	int contact_no;
	String staff_name,gender,address,email;
	
	public int getStaffId() {
		return staffid;
	}
	public void setStaffId(int id) {
		this.staffid = id;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public String getStaffName() {
		return staff_name;
	}
	public void setStaffName(String name) {
		this.staff_name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
