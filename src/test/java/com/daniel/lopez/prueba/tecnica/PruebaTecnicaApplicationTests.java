package com.daniel.lopez.prueba.tecnica;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.daniel.lopez.prueba.tecnica.service.EmployeeService;

@SpringBootTest
class PruebaTecnicaApplicationTests {
	
	@Autowired
	private EmployeeService employeeService;

	
	@Test
	void testGetAll() {
		assertTrue(employeeService.getAll().size()>0);
	}
	
	/*@Test
	void testById() {
		assertTrue(employeeService.getById(1L)!=null);
	}*/
	
	/*@Test
	void testByIdWrong() {
		Assertions.assertThrows(Exception.class, () -> {
			employeeService.getById(-12L);
		});
		//assertTrue(employeeService.getById(-1L)!=null);
	}*/

}
