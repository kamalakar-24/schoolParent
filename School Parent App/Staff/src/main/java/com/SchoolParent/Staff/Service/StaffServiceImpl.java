package com.SchoolParent.Staff.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolParent.Staff.Entity.Staff;
import com.SchoolParent.Staff.StaffRepository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	StaffRepository staffRepository;

	@Override
	public Staff save(Staff staff) {
		return staffRepository.save(staff);
	}

	@Override
	public List<Staff> getAll() {
		return staffRepository.findAll();
	}

}
