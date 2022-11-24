package com.SchoolParent.Parent.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.hibernate.validator.internal.engine.groups.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolParent.Parent.Entity.Parent;
import com.SchoolParent.Parent.Repository.ParentRepository;
import com.SchoolParent.Parent.Request.RequestApproval;

@Service
public class ParentServiceImpl implements ParentService {

	@Autowired
	ParentRepository parentRepository;

	@Override
	public Parent saveParent(Parent parent) {
//		Sequence rand = new Sequence();
//		long drand = (long)(rand.nextDouble()*1000000000L);
//		System.out.println(drand);
//		parent.setStudentRegistrationId(drand);
		  return parentRepository.save(parent);
		 
	}

	@Override
	public Parent update(Parent stdId) {
		Optional<Parent> list = parentRepository.findById(stdId.getStudentRegistrationId());
		if (list.get().getStudentRegistrationId() == stdId.getStudentRegistrationId()) {
			 parentRepository.save(stdId);
		}
		return stdId;
	}

	@Override
	public List<Parent> getAllStudents() {
		return parentRepository.findAll();
	}


	public void parentRequest(RequestApproval requestApproval) {
//		Long studentRegistrationId = Long.parseLong(requestApproval.getStudentRegistrationId());
		Parent parent = parentRepository.getById(requestApproval.getStudentRegistrationId());
		parent.setStatus(requestApproval.getStatus());
		parent.setDescription(requestApproval.getDescription());
		parentRepository.save(parent);

	}

}
