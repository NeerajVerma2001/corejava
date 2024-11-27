package com.api.corejava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.corejava.model.EmployeeModel;
import com.api.corejava.repository.EmployeeRepository;
import com.api.corejava.serviceInterface.ServiceInterface;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class EmployeeService implements ServiceInterface {

	@Autowired
	public EmployeeRepository repository;

	@Override
	public EmployeeModel addEmployee(EmployeeModel emp, HttpServletRequest request) {

		return repository.save(emp);
	}

}
