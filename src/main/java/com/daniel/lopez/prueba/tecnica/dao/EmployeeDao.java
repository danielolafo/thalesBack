package com.daniel.lopez.prueba.tecnica.dao;

import com.daniel.lopez.prueba.tecnica.bussines.EmployeeBussines;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDao {
	
	private Long id;
	@JsonProperty("employee_name")
	private String employeeName;
	@JsonProperty("employee_salary")
	private Long employeeSalary;
	@JsonProperty("employee_age")
	private Integer employeeAge;
	@JsonProperty("profile_image")
	private String profileImage;
	
	@JsonProperty("employee_anual_salary")
	private Long employeeAnualSalary;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Integer getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public Long getEmployeeAnualSalary() {
		return employeeAnualSalary;
	}
	public void setEmployeeAnualSalary(Long employeeAnualSalary) {
		this.employeeAnualSalary = employeeAnualSalary;
	}
	
	

}
