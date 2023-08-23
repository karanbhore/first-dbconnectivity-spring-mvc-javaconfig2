package com.prowings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.EmployeeRepository;
import com.prowings.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository; 
	
	public boolean saveEmployee(Employee e)
	{
		return repository.saveEmployeeToDb(e);
	}

	public List<Employee> viewAllEmployees()
	{
 	return repository.viewAllEmployees();
	}

}
