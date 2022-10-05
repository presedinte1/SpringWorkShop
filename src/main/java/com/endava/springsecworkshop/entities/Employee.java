package com.endava.springsecworkshop.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private String email;
    private String name;
    private String password;

    @OneToMany(mappedBy = "careerCoach")
    @ToString.Exclude
    private List<Employee> coachingEmployees;

    @ManyToOne
    @ToString.Exclude
    private Employee careerCoach;

    @ManyToOne
    @ToString.Exclude
    private Stream stream;

}
