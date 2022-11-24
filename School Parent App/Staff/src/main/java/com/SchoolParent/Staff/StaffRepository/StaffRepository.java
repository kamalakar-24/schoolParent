package com.SchoolParent.Staff.StaffRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SchoolParent.Staff.Entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{
	
	
}
