package com.daniel.lopez.prueba.tecnica.bussines;

import com.daniel.lopez.prueba.tecnica.dao.EmployeeDao;

public class EmployeeBussines {
	
	private EmployeeBussines() {}
	
	public static Long getAnualSalary(EmployeeDao employee) {
		return employee.getEmployeeSalary() * 12;
	}

}
