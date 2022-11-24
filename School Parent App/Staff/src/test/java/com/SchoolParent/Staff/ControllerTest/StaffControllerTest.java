package com.SchoolParent.Staff.ControllerTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.SchoolParent.Staff.Controller.StaffController;
import com.SchoolParent.Staff.Entity.Staff;
import com.SchoolParent.Staff.Service.StaffService;
import com.SchoolParent.Staff.Service.StaffServiceImpl;

@SpringBootTest
public class StaffControllerTest {

	@InjectMocks
	StaffController staffController;

	@Mock
	StaffServiceImpl staffservice;

//	@Test
//	public void saveTest() {
//		Staff staff = new Staff();
//
//		staff.setInformationText("Tomorrow is Holiday");
//		staff.setNotificationDate(null);
//		staff.setNotificationPostedBy("Kamalakar");
//		ResponseEntity response = new ResponseEntity("Notification posted Successfully", HttpStatus.OK);
//		Staff staff2 = staffservice.save(staff);
//
//		when(staffservice.save(staff)).thenReturn(staff);
//		ResponseEntity response2 = staffController.save(staff);
//		assertEquals(response2.getBody(), response.getBody());
//	}

	@Test
	public void getAllNotificationTest() {

		List<Staff> staff1 = new ArrayList<>();

		when(staffservice.getAll()).thenReturn(staff1);
		List<Staff> staff2 = staffController.getAll();
		assertThat(staff2).isNotNull();
		assertEquals(0, staff1.size());
	}

}
