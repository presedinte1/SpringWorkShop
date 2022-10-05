package com.endava.springsecworkshop.controller;

import com.endava.springsecworkshop.entities.dto.EmployeeDto;
import com.endava.springsecworkshop.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private static EmployeeService employeeService;


    @GetMapping()
    public List<EmployeeDto> getAllEmployee (){
        return employeeService.getAllEmployee();
    }

}
