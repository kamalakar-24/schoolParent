package com.SchoolParent.Staff.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolParent.Staff.Entity.Staff;
import com.SchoolParent.Staff.Service.StaffService;

@CrossOrigin
@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	@PostMapping("/save")
	public ResponseEntity save(@RequestBody Staff staff) {
	Staff st = staffService.save(staff);
		ResponseEntity response =new ResponseEntity (" Notification Posted Successfully" , HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/getAll")
	public List<Staff> getAll(){
		return staffService.getAll();
	}

}
