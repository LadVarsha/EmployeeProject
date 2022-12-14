package com.emp.service;

import java.util.List;

import com.emp.entity.EmployeeEntity;

public interface EmployeeService {
	
	public EmployeeEntity saveEmployee(EmployeeEntity employee);
	
	public List<EmployeeEntity> getAllEmployee();
	
	public List<EmployeeEntity> getListByName(String name);
	
	public EmployeeEntity updateEmployee(EmployeeEntity employee);

}
