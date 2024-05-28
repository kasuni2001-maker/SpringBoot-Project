package com.kasuni.school.service;

import java.util.List;

import com.kasuni.school.entity.Teacher;

public interface TeacherService {
     List<Teacher > getAllTeachers(); 
     Teacher savTeacher(Teacher teacher);

     Teacher getTeacherById(Long id);
     Teacher updateTeacher(Teacher teacher);

     void deleteTeacherById(Long id);

}
 