package com.api.corejava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.corejava.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel, String> {

}
