package org.cg.b3.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.cg.b3.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	List<Employee> empList = new ArrayList<Employee>();
	@Override
	public Employee findEmployeeById(int empId) {
		
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		System.out.println("In EmployeeDao---->");
		Employee employee  = new Employee();
		employee.setEmpNo(533225);
		employee.setEmpName("Sid");
		employee.setHireDate(LocalDate.of(2021, 8, 19));
		employee.setSalary(20000);
		employee.setJob("Developer");
		empList.add(employee);
		
		employee = new Employee();
		employee.setEmpNo(423535);
		employee.setEmpName("Tez");
		employee.setHireDate(LocalDate.of(2021, 7, 20));
		employee.setSalary(40700);
		employee.setJob("Tester");
		empList.add(employee);
		return empList;
	}

	@Override
	public List<Employee> findEmployeesByDept() {
		
		return null;
	}

	@Override
	public void deleteEmployee(Employee empId) {
		
	}

}
