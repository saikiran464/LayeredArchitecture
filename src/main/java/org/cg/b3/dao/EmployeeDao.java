package org.cg.b3.dao;

import java.util.List;

import org.cg.b3.dto.Employee;

public interface EmployeeDao {
	public Employee findEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> findEmployeesByDept();
	public void deleteEmployee(Employee empId);
}
