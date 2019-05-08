package com.capgemini.employee.taxcalculator.main;

import com.capgemini.employee.taxcalculator.exception.CountryNotValidException;
import com.capgemini.employee.taxcalculator.exception.EmployeeNameInvalidException;
import com.capgemini.employee.taxcalculator.exception.TaxNotEligibleException;

public class TaxCalculator {

	private String employeeName;
	private boolean isIndian;
	private double employeeSalary;

	public TaxCalculator() {
		super();

	}

	public TaxCalculator(String employeeName, boolean isIndian, double employeeSalary)
			throws EmployeeNameInvalidException, CountryNotValidException {
		super();

		if (employeeName != null && employeeName != " ") {
			this.employeeName = employeeName;

		} else {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}

		if (isIndian) {
			this.isIndian = isIndian;
		} else {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}

		this.employeeSalary = employeeSalary;
	}

	public double calculateTax() throws TaxNotEligibleException {

		if (this.employeeSalary >= 100000 && isIndian)
			return (this.employeeSalary * 8) / 100;

		else if (this.employeeSalary < 100000 && this.employeeSalary > 50000 && isIndian)
			return (this.employeeSalary * 6) / 100;

		else if (this.employeeSalary < 50000 && this.employeeSalary > 30000 && isIndian)
			return (this.employeeSalary * 5) / 100;

		else if (this.employeeSalary < 30000 && this.employeeSalary > 10000 && isIndian)
			return (this.employeeSalary * 4) / 100;

		else
			throw new TaxNotEligibleException("The employee does not need to pay tax”");

	}

}
