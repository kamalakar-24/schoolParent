package com.SchoolParent.Staff.Controller.Advicetest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.SchoolParent.Staff.Controller.Advice.GenaralExceptionalHandler;
import com.SchoolParent.Staff.Response.ErrorResponse;

@SpringBootTest
public class ControllerAdviceTest {

	@InjectMocks
	GenaralExceptionalHandler exceptionalHandler;

	@Test
	public void ExceptionTest() {
		Exception exe = new Exception();
		ErrorResponse response = exceptionalHandler.handleException(exe);
		ErrorResponse response1 = new ErrorResponse();
		response1.setDescription(exe.getMessage());
		response1.setErrorcode("Genaral");
		response1.setException(exe);
		assertNotNull(response);
	}

}
