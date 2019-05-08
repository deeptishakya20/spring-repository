package com.capgemini.onetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetomany.certificates.Certificates;
import com.capgemini.onetomany.dao.EmployeeDao;
import com.capgemini.onetomany.employee.Employee;
import com.capgemini.onetomany.service.EmployeeSerivce;

@RestController
public class OneToManyController {

	@Autowired
	private EmployeeSerivce service;

	@RequestMapping("/")
	public String addNewEmployee() {

		Set<Certificates> set = new HashSet<Certificates>();
		set.add(new Certificates(501, "AWS"));
		set.add(new Certificates(502, "Java"));
		set.add(new Certificates(503, "Python"));
		service.addNew(new Employee(101, "Deepti", set));
		return "Added";

	}
	@RequestMapping("/new")
	public Employee getAll() {

		return service.getById(101);

	}

}
