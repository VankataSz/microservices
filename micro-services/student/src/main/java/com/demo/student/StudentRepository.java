package com.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//This is our Student repository
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
