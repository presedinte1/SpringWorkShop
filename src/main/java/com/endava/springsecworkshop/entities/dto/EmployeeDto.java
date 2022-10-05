package com.endava.springsecworkshop.entities.dto;

import com.endava.springsecworkshop.entities.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String email;
    private String name;
    private String password;
    private String careerCoachEmail;
    private String streamName;

    public static EmployeeDto employeeToEmployeeDto(Employee employee){
        return EmployeeDto.builder().email(employee.getEmail())
                .name(employee.getName())
                .password(employee.getPassword())
                .careerCoachEmail(employee.getCareerCoach().getEmail())
                .streamName(employee.getStream().getName()).build();

    }

}
