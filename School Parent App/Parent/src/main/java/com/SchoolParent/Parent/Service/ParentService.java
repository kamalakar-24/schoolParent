package com.SchoolParent.Parent.Service;

import java.util.List;

import com.SchoolParent.Parent.Entity.Parent;
import com.SchoolParent.Parent.Request.RequestApproval;

public interface ParentService {

	Parent saveParent(Parent parent);

	Parent update(Parent stdId);

	List<Parent> getAllStudents();
	
	void parentRequest(RequestApproval requestApproval);
	
	

}
