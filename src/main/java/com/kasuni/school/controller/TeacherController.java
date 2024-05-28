package com.kasuni.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
 
import com.kasuni.school.entity.Teacher;
import com.kasuni.school.service.TeacherService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping; 


@Controller
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
   
    //Handler method to list teachers and return model and view
    @GetMapping("/teachers")
    public String listTeachers(Model model) {
         model.addAttribute("teachers", teacherService.getAllTeachers());
         return "teacher/teacher";
    }

    @GetMapping("/teacher/new")
    public String createTeacher(Model model) {
        // Create student object to build student form
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "teacher/create_teacher";
    } 

    @PostMapping("/teachers")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
        teacherService.savTeacher(teacher);
        return "redirect:/teachers"; 
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable Long id, Model model) {
        model.addAttribute("teacher", teacherService.getTeacherById(id));
        return "teacher/edit_teacher";
    } 

    @PostMapping("/teachers/{id}")
    public String updateTeacher(@PathVariable Long id, @ModelAttribute("teacher") Teacher teacher, Model model) {
        // Get teacher from database by id
        Teacher existingTeacher = teacherService.getTeacherById(id);
        existingTeacher.setFirstName(teacher.getFirstName());
        existingTeacher.setLastName(teacher.getLastName());
        existingTeacher.setEmail(teacher.getEmail());
        existingTeacher.setSubject(teacher.getSubject());
        existingTeacher.setTelephoneNumber(teacher.getTelephoneNumber());
        existingTeacher.setUsername(teacher.getUsername());
        existingTeacher.setGender(teacher.getGender());

        // Save updated teacher object
        teacherService.updateTeacher(existingTeacher);
        return "redirect:/teachers";
    }

    
    
 
}  
    

