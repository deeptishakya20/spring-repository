package com.capgemini.onetomany.employee;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.capgemini.onetomany.certificates.Certificates;

@Entity
public class Employee {
	
	@Id
	private int EmployeeId;
	private String EmployeeName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Certificates> certificates;
	
	public Employee(int employeeId, String employeeName, Set<Certificates> certificates) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		this.certificates = certificates;
	}
	
	public Employee() {
		super();

	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	
	 public void setCertificates(Set<Certificates> certificates) {
		 this.certificates = certificates;
	 }
	 public Set<Certificates> getCertificates() {
		 return certificates;
	 }

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", certificates="
				+ certificates + "]";
	}
	 
	
}
