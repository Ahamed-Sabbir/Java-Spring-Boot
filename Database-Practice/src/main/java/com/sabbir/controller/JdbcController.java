package com.sabbir.controller;

import ch.qos.logback.core.model.INamedModel;
import com.sabbir.model.Student;
import com.sabbir.service.StudentService;
import org.springframework.data.relational.core.sql.In;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JdbcController {

    private final StudentService studentService;

    public JdbcController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<?> saveStudent(@RequestBody Student student){
        studentService.saveStudentInDB(student);
        return new ResponseEntity<>("Student info set Succefully", HttpStatus.CREATED);
    }

    @GetMapping("/student/name/{id}")
    public ResponseEntity<?> getName(@PathVariable Integer id) {
        String studentName = studentService.getStudentNameById(id);
        return new ResponseEntity<>(studentName, HttpStatus.OK);
    }

    @GetMapping("/student/onestudent/{id}")
    public ResponseEntity<?> getInfo (@PathVariable Integer id) {
        Student student = studentService.getStudentFromDb(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/student/allstudent")
    public ResponseEntity<?> getInfo () {
        List<Student> student = studentService.getAllStudentFromDb();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}
