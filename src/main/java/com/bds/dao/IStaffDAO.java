package com.bds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bds.entity.Staff;

@Repository
public interface IStaffDAO extends JpaRepository<Staff, Integer>{
	
}
