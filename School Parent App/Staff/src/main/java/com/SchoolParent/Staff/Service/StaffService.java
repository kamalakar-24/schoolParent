package com.SchoolParent.Staff.Service;

import java.util.List;

import com.SchoolParent.Staff.Entity.Staff;

public interface StaffService {

	Staff save(Staff staff);

	List<Staff> getAll();

}
