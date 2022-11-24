package com.SchoolParent.Parent.ControllerTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.SchoolParent.Parent.Controller.ParentController;
import com.SchoolParent.Parent.Entity.Parent;
import com.SchoolParent.Parent.Repository.ParentRepository;
import com.SchoolParent.Parent.Service.ParentServiceImpl;

@SpringBootTest
public class ParentControllerTest {
	
	@InjectMocks
	ParentController parentController;
	
	@Mock
	ParentServiceImpl parentService;
	
//	@Test
//	public void updateTest() {
//	
//	}
	
	@Test
	public void getAllTest() {
	List<Parent> staff1= new ArrayList<>();
		
		when(parentService.getAllStudents()).thenReturn(staff1);
		List<Parent> staff2= parentController.getll();
		assertThat(staff2).isNotNull();
		assertEquals(0 , staff1.size());
		
	}

}
