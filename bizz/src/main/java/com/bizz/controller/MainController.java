package com.bizz.controller;

import com.bizz.model.Form;
import com.bizz.model.Student;
import com.bizz.model.Teacher;
import com.bizz.service.FormServiceImpl;
import com.bizz.service.StudentServiceImpl;
import com.bizz.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    private TeacherServiceImpl teacherService;
    private StudentServiceImpl studentService;
    private FormServiceImpl formService;
    @Autowired
    public MainController(TeacherServiceImpl teacherService, StudentServiceImpl studentService, FormServiceImpl formService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
        this.formService = formService;
    }

    @GetMapping("/teachers/page={value}sort={column}")
    public Page<Teacher> getTeachers(@PathVariable int value, @PathVariable String column){
        return teacherService.list(value, column);
    }

    @GetMapping("/students/page={value}sort={column}")
    public Page <Student> getStudents(@PathVariable int value, @PathVariable String column){
        return studentService.list(value, column);
    }

    @GetMapping("/forms/page={value}sort={column}")
    public Page <Form> getForms(@PathVariable int value, @PathVariable String column){
        return formService.list(value, column);
    }

    @PostMapping(value = "/students")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        studentService.create(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/students/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable(name = "id") Long id) {
        final boolean deleted = studentService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @PostMapping(value = "/teachers")
    public ResponseEntity<?> createTeacher(@RequestBody Teacher teacher) {
        teacherService.create(teacher);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/teachers/{id}")
    public ResponseEntity<?> deleteTeacher(@PathVariable(name = "id") Long id) {
        final boolean deleted = teacherService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @PostMapping(value = "/forms")
    public ResponseEntity<?> createForm(@RequestBody Form form) {
        formService.create(form);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/forms/{id}")
    public ResponseEntity<?> deleteForm(@PathVariable(name = "id") Long id) {
        final boolean deleted = formService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
