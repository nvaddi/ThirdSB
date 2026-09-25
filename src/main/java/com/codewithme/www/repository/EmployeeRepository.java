package com.codewithme.www.repository;

import org.springframework.data.repository.CrudRepository;

import com.codewithme.www.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
