package com.daniel.lopez.prueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.lopez.prueba.tecnica.dao.EmployeeDao;
import com.daniel.lopez.prueba.tecnica.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/getAll")
	public List<EmployeeDao> getAll() throws Exception{
		try {
			return employeeService.getAll();
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	@GetMapping("/getById/{id}")
	public EmployeeDao getById(@PathVariable("id") Long id) throws Exception {
		try {
			return employeeService.getById(id);
		}catch(Exception e) {
			throw new Exception();
		}
	}

}
