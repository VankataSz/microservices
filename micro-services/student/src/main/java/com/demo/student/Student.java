package com.demo.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


//This is our Entity class
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer schoolId;



}
