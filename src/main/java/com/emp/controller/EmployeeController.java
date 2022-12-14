package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.EmployeeEntity;
import com.emp.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empservice;

	@PostMapping("/employee/save")
	public ResponseEntity<EmployeeEntity> saveEmployeeData(@RequestBody EmployeeEntity employee) {

		EmployeeEntity emp = empservice.saveEmployee(employee);

		return ResponseEntity.ok().body(emp);

	}

	@GetMapping("/employee/getAllEmployee")
	public List<EmployeeEntity> getAllData() {

		return empservice.getAllEmployee();

	}

	@GetMapping("/employee/{name}")
	public ResponseEntity<List<EmployeeEntity>> getListByEmployeeName(@PathVariable("name") String name) {

		List<EmployeeEntity> list1 = empservice.getListByName(name);
		return ResponseEntity.ok().body(list1);

	}

	@PutMapping("/employee/updateEmployee")
	public EmployeeEntity updateStudentData(@RequestBody EmployeeEntity employee) {
		return empservice.updateEmployee(employee);

	}
}
