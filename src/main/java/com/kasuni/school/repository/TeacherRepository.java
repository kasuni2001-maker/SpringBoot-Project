package com.kasuni.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kasuni.school.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long > {
    
}
