package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.EmployeeEntity;
import com.emp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository emprepo;

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {

		return emprepo.save(employee);
	}

	@Override
	public List<EmployeeEntity> getAllEmployee() {

		return emprepo.findAll();
	}

	@Override
	public List<EmployeeEntity> getListByName(String name) {

		List<EmployeeEntity> list = emprepo.findByName(name);

		return list;
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employee) {

		return emprepo.save(employee);
	}

}
