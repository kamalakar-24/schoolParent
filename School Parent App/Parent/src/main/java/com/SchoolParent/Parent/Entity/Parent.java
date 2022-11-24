package com.SchoolParent.Parent.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.transaction.Transactional;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name = "Parent")
@SequenceGenerator( name = "hibernate_sequence" , initialValue=1000000000)


public class Parent {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE , generator = "hibernate_sequence")
	private Long studentRegistrationId;

	@NotBlank
	private String parentName;

	@NotBlank
	private String studentName;

	@NotBlank
	private String address;

	@NotBlank
	private String country;
	
	@NotBlank
	private String state;

	@NotBlank
	private String city;

	private Integer studentAge;

	private LocalDate registrationDate;

	private Integer zipCode;

	@NotBlank
	@Email
	private String emailAddress;

	@NotBlank
	private String primaryContactPerson;

	private Long primaryContactPersonMobile;

	@NotBlank
	private String secondaryContactPerson;

	private Long secondaryContactPersonMobile;
	
	private String status;
	
	private String description;

	public Long getStudentRegistrationId() {
		return studentRegistrationId;
	}

	public void setStudentRegistrationId(Long studentRegistrationId) {
		this.studentRegistrationId = studentRegistrationId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPrimaryContactPerson() {
		return primaryContactPerson;
	}

	public void setPrimaryContactPerson(String primaryContactPerson) {
		this.primaryContactPerson = primaryContactPerson;
	}

	public Long getPrimaryContactPersonMobile() {
		return primaryContactPersonMobile;
	}

	public void setPrimaryContactPersonMobile(Long primaryContactPersonMobile) {
		this.primaryContactPersonMobile = primaryContactPersonMobile;
	}

	public String getSecondaryContactPerson() {
		return secondaryContactPerson;
	}

	public void setSecondaryContactPerson(String secondaryContactPerson) {
		this.secondaryContactPerson = secondaryContactPerson;
	}

	public Long getSecondaryContactPersonMobile() {
		return secondaryContactPersonMobile;
	}

	public void setSecondaryContactPersonMobile(Long secondaryContactPersonMobile) {
		this.secondaryContactPersonMobile = secondaryContactPersonMobile;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

}
