package com.SchoolParent.Parent.Request;

public class RequestApproval {

	private Long studentRegistrationId;

	private String status;

	private String description;

	public Long getStudentRegistrationId() {
		return studentRegistrationId;
	}

	public void setStudentRegistrationId(Long studentRegistrationId) {
		this.studentRegistrationId = studentRegistrationId;
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

}
