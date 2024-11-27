package com.api.corejava.serviceInterface;

import com.api.corejava.model.EmployeeModel;

import jakarta.servlet.http.HttpServletRequest;

public interface ServiceInterface {

	public EmployeeModel addEmployee(EmployeeModel emp, HttpServletRequest request);

//	public String deleteEmployeeById(String id, HttpRequest request);
//	
//	public EmployeeModel deleteEmployee(EmployeeModel employeeModel , HttpRequest request);


}
