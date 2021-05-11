package org.cg.b3.main;

import java.util.List;

import org.cg.b3.dao.EmployeeDao;
import org.cg.b3.dao.EmployeeDaoImpl;
import org.cg.b3.dto.Employee;
import org.cg.b3.service.EmployeeService;
import org.cg.b3.service.EmployeeServiceImpl;

public class EmployeeDriver {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeService employeeService = new EmployeeServiceImpl(employeeDao);
		
		List<Employee> empList = employeeService.getEmployees();
		for(Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
