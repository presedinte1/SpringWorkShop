package com.endava.springsecworkshop.repository;

import com.endava.springsecworkshop.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee, String> {

    //List<Employee> findAll();
}
