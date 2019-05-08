package com.capgemini.inheritancemapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritancemapping.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public void addNew(Employee employee) {
		dao.save(employee);
		
	}


	@Override
	public Employee getById(int id) {
		Employee employee = dao.findById(id).get();
		return employee;
	}

}