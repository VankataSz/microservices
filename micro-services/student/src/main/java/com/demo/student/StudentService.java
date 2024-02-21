package com.demo.student;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


// Service class (Business logic class)
@Service
@RequiredArgsConstructor
public class StudentService {

    // Here we inject our student repository
    private final StudentRepository studentRepository;

    private final StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }

    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return repository.findAllBySchoolId(schoolId);
    }
}
