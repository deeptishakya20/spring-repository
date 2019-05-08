package com.capgemini.lambda.client;
import java.util.Comparator;
import java.util.TreeSet;
import com.capgemini.lambda.model.*;

public class EmployeeClient {

	public static void main(String args[]) {
		
		Comparator<Employee> c=(e1,e2)->Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
				
				//new Comparator<Employee>() //{

			//@Override
			//public int compare(Employee e1, Employee e2) {
				
			//return Integer.compare(e1.getEmployeeId(),e2.getEmployeeId());
			//}
			
			//};
		
		TreeSet <Employee> employees = new TreeSet <> (c);
		//<Employee>(c);
		
		employees.add(new Employee(101,"Joy","HR",45000));
		employees.add(new Employee(123,"Jhon","Admin",25000));
		employees.add(new Employee(65,"Bob","Admin",35000));
		employees.add(new Employee(96,"Marry","HR",50000));
		
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}

	}
}
