package org.cg.b3.service;

import java.util.List;

import org.cg.b3.dao.EmployeeDao;
import org.cg.b3.dto.Employee;

public interface EmployeeService{
	public Employee getEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> getEmployeesByDept();
	public void deleteEmployee(int empId);
}
