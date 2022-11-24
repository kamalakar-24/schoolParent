package com.SchoolParent.Staff.ServiceTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.SchoolParent.Staff.Entity.Staff;
import com.SchoolParent.Staff.Service.StaffServiceImpl;
import com.SchoolParent.Staff.StaffRepository.StaffRepository;

@SpringBootTest
public class StaffServiceTest {

	@InjectMocks
	StaffServiceImpl staffService;

	@Mock
	StaffRepository staffRepository;

	@Test
	public void saveTest() {
		Staff staff = new Staff();
		staff.setInformationText("Tomorrow is Holiday");
		staff.setNotificationDate(null);
		staff.setNotificationPostedBy("Kamalakar");

		when(staffRepository.save(staff)).thenReturn(staff);
		Staff staff1 = staffService.save(staff);
		assertEquals("Kamalakar", staff.getNotificationPostedBy());

	}
	
	@Test
	public void getAllTest() {	
		List<Staff> staff1= new ArrayList<>();
		
		when(staffRepository.findAll()).thenReturn(staff1);
		List<Staff> staff2= staffService.getAll();
		assertThat(staff2).isNotNull();
		assertEquals(0 , staff1.size());
	}
}
