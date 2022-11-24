package com.SchoolParent.Staff.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "Staff")

public class Staff {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long notificationId;

	@NotBlank
	private String informationText;

	@NotBlank
	private String notificationPostedBy;

	@NotNull
	private LocalDate notificationDate;

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public String getInformationText() {
		return informationText;
	}

	public void setInformationText(String informationText) {
		this.informationText = informationText;
	}

	public String getNotificationPostedBy() {
		return notificationPostedBy;
	}

	public void setNotificationPostedBy(String notificationPostedBy) {
		this.notificationPostedBy = notificationPostedBy;
	}

	public LocalDate getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(LocalDate notificationDate) {
		this.notificationDate = notificationDate;
	}

}
