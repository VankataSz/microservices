package com.demo.school;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

//This is our School entity class
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class School {

    @Id
    private Integer id;
    private String name;
    private String email;
}
