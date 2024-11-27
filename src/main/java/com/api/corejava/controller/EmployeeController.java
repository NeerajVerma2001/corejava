package com.api.corejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.corejava.model.EmployeeModel;
import com.api.corejava.serviceInterface.ServiceInterface;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class EmployeeController {

	@Autowired
	private ServiceInterface service;
//	this is controller 
	@PostMapping("addEmployee")
	public ResponseEntity<EmployeeModel> addEmployee(@RequestBody EmployeeModel emp , HttpServletRequest request) {
		return new ResponseEntity<EmployeeModel>(service.addEmployee(emp, request),HttpStatus.CREATED);
	}
	
}
