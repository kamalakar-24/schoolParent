package com.SchoolParent.Parent.ServiceTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.SchoolParent.Parent.Entity.Parent;
import com.SchoolParent.Parent.Repository.ParentRepository;
import com.SchoolParent.Parent.Service.ParentServiceImpl;



@SpringBootTest
public class ParentServiceTest {

	@InjectMocks
	ParentServiceImpl parentService;

	@Mock
	ParentRepository parentRepository;

	@Test
	public void saveParentTest() {
		Parent parent = new Parent();

		parent.setAddress("Guntur");
		parent.setCity("Vijayawada");
		parent.setCountry("India");
		parent.setEmailAddress("tkr@email.com");
		parent.setParentName("Gnanaih");
		parent.setPrimaryContactPerson("gnanaiah");
		parent.setPrimaryContactPersonMobile(123456789L);
		parent.setRegistrationDate(null);
		parent.setSecondaryContactPersonMobile(9876543210L);
		parent.setSecondaryContactPerson("yesamma");
		parent.setStudentAge(5);
		parent.setStudentName("Kamalakar");
		parent.setZipCode(1233456);

		when(parentService.saveParent(parent)).thenReturn(parent);
		Parent parent2 = parentRepository.save(parent);
		assertEquals("Guntur", parent.getAddress());
	}

	@Test
	public void updateTest() {

		Parent parent = new Parent();

		parent.setAddress("Guntur");
		parent.setCity("Vijayawada");
		parent.setCountry("India");
		parent.setEmailAddress("tkr@email.com");
		parent.setParentName("Gnanaih");
		parent.setPrimaryContactPerson("gnanaiah");
		parent.setPrimaryContactPersonMobile(123456789L);
		parent.setRegistrationDate(null);
		parent.setSecondaryContactPersonMobile(9876543210L);
		parent.setSecondaryContactPerson("yesamma");
		parent.setStudentAge(5);
		parent.setStudentName("Kamalakar");
		parent.setZipCode(1233456);

		Optional<Parent> emp = Optional.of(parent);
		Mockito.when(parentRepository.findById(parent.getStudentRegistrationId())).thenReturn(emp);
		Parent saveParent = parentService.update(parent);
//		assertThat(saveEmployee.equals(employee));
		System.out.println("you Record is Updated");
		System.out.println(saveParent);
		System.out.println(parent);
		assertNotNull(saveParent);

	}
	
	@Test
	public void getAllTest() {
	List<Parent> staff1= new ArrayList<>();
		
		when(parentRepository.findAll()).thenReturn(staff1);
		List<Parent> staff2= parentService.getAllStudents();
		assertThat(staff2).isNotNull();
		assertEquals(0 , staff1.size());
		
	}
}
