package com.SchoolParent.Parent.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolParent.Parent.Entity.Parent;
import com.SchoolParent.Parent.Repository.ParentRepository;
import com.SchoolParent.Parent.Request.RequestApproval;
import com.SchoolParent.Parent.Response.MessageResponse;
import com.SchoolParent.Parent.Service.ParentService;

@CrossOrigin
@RestController
@RequestMapping("/parent")
public class ParentController {

	@Autowired
	ParentService parentService;

	@Autowired
	ParentRepository parentRepository;

	@PostMapping("/saveParent")
	public ResponseEntity save(@RequestBody Parent parent) {
		ResponseEntity response=null;
		if (parent.getStudentAge() <= 4) {
			 response=ResponseEntity.badRequest().body(new MessageResponse("Error: Student age must be greater than 4"));
		} else {
			parentService.saveParent(parent);
			response=ResponseEntity.ok().body(new MessageResponse("Submitted"));

		}
		return response;
		

	}

	@PutMapping("/updateParent")
	public ResponseEntity update(@RequestBody Parent stdId) {
		ResponseEntity response=null;
		if (stdId.getStudentAge() <= 4) {
			 response=ResponseEntity.badRequest().body(new MessageResponse("Error: Student age must be greater than 4"));
		} else {
			parentService.update(stdId);
			 response = new ResponseEntity("Updated Successfully ", HttpStatus.OK);

		}
		
		
		return response;

	}

	@GetMapping("/getAll")
	public List<Parent> getll() {
		return parentService.getAllStudents();

	}
	@PostMapping("/approval")
	public String parentRequestApproval(@RequestBody RequestApproval requestApproval) {
		String status = "";
		if (requestApproval.getStatus().equals("Approved")) {
			parentService.parentRequest(requestApproval);
			status = "Parent Request is Approved";

		} else {
			parentService.parentRequest(requestApproval);
			status = "Rejected";
		}

		return status;

	}

}
