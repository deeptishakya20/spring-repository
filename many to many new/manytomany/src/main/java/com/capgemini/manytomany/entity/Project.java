package com.capgemini.manytomany.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int ProjectId;
	private String ProjectName;
	
	@ManyToMany
	@JoinTable(name= "employee_project", joinColumns = @JoinColumn(name = "PROJECT_ID"),
	inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
	Set<Employee> employee;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName) {
		super();
		ProjectId = projectId;
		ProjectName = projectName;
	}

	public int getProjectId() {
		return ProjectId;
	}

	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

//	public Set<Employee> getEmployee() {
//		return employee;
//	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [ProjectId=" + ProjectId + ", ProjectName=" + ProjectName + "]";
	}
	
	
	

}