package com.daniel.lopez.prueba.tecnica.service;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.daniel.lopez.prueba.tecnica.bussines.EmployeeBussines;
import com.daniel.lopez.prueba.tecnica.dao.EmployeeDao;
import com.daniel.lopez.prueba.tecnica.dao.ResponseDao;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeService {
	
	
	RestTemplate restTemplate = new RestTemplate();
	HttpHeaders headers = new HttpHeaders();
	ObjectMapper mapper = new ObjectMapper();
	{
		headers.add("User-Agent", "any");
	}
	
	@Value("${dummy.api.url.employee-by-id}")
	private String getEmployeeByIdUrl;
	
	@Value("${dummy.api.url.employees}")
	private String getAllEmployeesUrl;
	
	public List<EmployeeDao> getAll(){
		HttpEntity<Object> entity = new HttpEntity<Object>(this.headers);
		List<EmployeeDao> lstEmployees = (List<EmployeeDao>) restTemplate.exchange(getAllEmployeesUrl, HttpMethod.GET, entity, ResponseDao.class).getBody().getData();
		int idx=0;
		for(Object emp: lstEmployees) {
			EmployeeDao employee = mapper.convertValue(emp, EmployeeDao.class);
			employee.setEmployeeAnualSalary(EmployeeBussines.getAnualSalary(employee));
			lstEmployees.set(idx, employee);
			idx+=1;
		}
		return lstEmployees;
	}
	
	public EmployeeDao getById(Long id) {
		HttpEntity<Object> entity = new HttpEntity<Object>(this.headers);
		EmployeeDao employee = mapper.convertValue(restTemplate.exchange(MessageFormat.format(getEmployeeByIdUrl, id), HttpMethod.GET, entity, ResponseDao.class).getBody().getData(), EmployeeDao.class);
		employee.setEmployeeAnualSalary(EmployeeBussines.getAnualSalary(employee));
		return employee;
	}

}
