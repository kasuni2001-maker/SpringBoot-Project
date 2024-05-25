package com.kasuni.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kasuni.school.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}

 