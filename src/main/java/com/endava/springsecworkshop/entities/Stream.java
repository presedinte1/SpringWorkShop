package com.endava.springsecworkshop.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stream {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String department;
    private String name;

    @OneToOne
    private Employee mentor;

    @OneToMany(mappedBy = "stream")
    private List<Employee> membersOfStream;
}
