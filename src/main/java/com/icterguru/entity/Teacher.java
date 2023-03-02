package com.icterguru.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "icterguru_dev", name = "teacher_table"	)
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="LastName", nullable = false, length = 20)
	private String lastName;
	@Column(name="FirstName", nullable = false, length = 20)
	private String firstName;
	@Column(name="Email", nullable = false, length = 20)
	private String email;
	@Column(name="Phone", nullable = false, length = 20)
	private String phone;
	@Column(name="Department", nullable = false, length = 20)
	private String department;
	@Column(name="Designation", nullable = false, length = 20)
	private String designation;
	@Column(name="Notes", nullable = true)
	private String notes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Teacher(String lastName, String firstName, String email, String phone, String department, String designation,
			String notes) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phone = phone;
		this.department = department;
		this.designation = designation;
		this.notes = notes;
	}
	
	
	public Teacher() {
		
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
				+ ", phone=" + phone + ", department=" + department + ", designation=" + designation + ", notes=" + notes + ", getId()=" + getId()
				+ ", getLastName()=" + getLastName() + ", getFirstName()=" + getFirstName() + ", getEmail()="
				+ getEmail() + ", getPhone()=" + getPhone() + ", getDepartment()=" + getDepartment() + ", getdesignation()=" + getDesignation()
				+ ", getNotes()=" + getNotes() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

	
}

