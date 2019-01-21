package com.bds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bds.dao.IStaffDAO;
import com.bds.entity.Staff;

@Service
public class StaffService {
	@Autowired
	private IStaffDAO staffDAO;
	
	public Staff add(Staff staff) {
		return staffDAO.save(staff);
	}
	
	public void delete(int id) {
		staffDAO.deleteById(id);
	}
	
	public List<Staff> getAll() {
		return staffDAO.findAll();
	}
	
	public Staff getOne(int id) {
		return staffDAO.getOne(id);
	}
}
