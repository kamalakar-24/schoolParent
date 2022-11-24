package com.SchoolParent.Parent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SchoolParent.Parent.Entity.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {

}
