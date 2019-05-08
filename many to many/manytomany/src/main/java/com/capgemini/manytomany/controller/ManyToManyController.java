package com.capgemini.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.manytomany.entity.Person;
import com.capgemini.manytomany.entity.Project;
import com.capgemini.manytomany.service.PersonService;

@RestController
public class ManyToManyController{
	
	@Autowired
	PersonService service;

	@RequestMapping("/")
	public void setPerson() {
		Set<Person> personSet1 = new HashSet<Person>();
		Set<Person> personSet2 = new HashSet<Person>();
		Set<Person> personSet3 = new HashSet<Person>();
		
		
		Set<Project> projectSet1 = new HashSet<Project>();
		Set<Project> projectSet2 = new HashSet<Project>();
		Set<Project> projectSet3 = new HashSet<Project>();
	
		Person person1 = new Person(101, "Ruchir");
		Person person2 = new Person(102, "Dipti");
		Person person3 = new Person(103, "Mark");
		
		Project project1 = new Project(501, "AWS");
		Project project2 = new Project(502, "Java");
		Project project3 = new Project(503, "Python");
		
		personSet1.add(person1);
		personSet1.add(person2);
		personSet2.add(person3);
		personSet3.add(person1);
		
		project1.setPerson(personSet1);
		project2.setPerson(personSet2);
		project3.setPerson(personSet3);
		
		projectSet1.add(project1);
		projectSet1.add(project3);
		projectSet2.add(project1);
		projectSet3.add(project2);
		
		service.addNewPerson(personSet1);
		service.addNewPerson(personSet2);
		service.addNewPerson(personSet3);
		
		service.addNewProject(projectSet1);
		service.addNewProject(projectSet2);
		service.addNewProject(projectSet3);
	}

	@RequestMapping("/new")
	public Set<Person> getPerson() {
		Set<Person> person = new HashSet<Person>();
		for(int i=101; i<104; i++)
		{
			person.add(service.findPersonById(i));
			
		}
		return person;
	}
	
}