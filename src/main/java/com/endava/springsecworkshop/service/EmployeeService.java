package com.endava.springsecworkshop.service;

import com.endava.springsecworkshop.entities.dto.EmployeeDto;
import com.endava.springsecworkshop.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;


    public List<EmployeeDto> getAllEmployee(){
        return null; //employeeRepository.findAll().stream().map(() -> )
    }
}
