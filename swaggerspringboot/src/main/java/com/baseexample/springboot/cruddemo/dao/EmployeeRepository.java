package com.baseexample.springboot.cruddemo.dao;

import java.util.List;

import com.baseexample.springboot.cruddemo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	 @Query(value = "SELECT e FROM Employee e WHERE e.lastname=:c")
	   
	 

		public List<Employee> getAllEmployeesUsingJPAQL( @Param("c")String lastname);

	   
     
	   
	   
	   

	
	
}