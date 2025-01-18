package com.sabbir.controller;

import com.sabbir.model.Laptop;
import com.sabbir.model.Student;
import com.sabbir.service.LaptopService;
import com.sabbir.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MainController {
    private final StudentService studentService;
    private final LaptopService laptopService;
    public MainController(StudentService studentService, LaptopService laptopService) {
        this.studentService = studentService;
        this.laptopService = laptopService;
    }

    @GetMapping("/student/all")
    public List<Student> getAllStudent(){
        return studentService.getStudentsFromDb();
    }

    @GetMapping("/student/id/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getByID(id);
    }

    @GetMapping("/student/{gender}")
    public List<Student> getStudentByGender(@PathVariable String gender){
        return studentService.getByGender(gender);
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudentInDB(student);
    }

    @PostMapping("/laptop")
    public void saveLaptop(@RequestBody Laptop laptop) {
        laptopService.addLaptopInDB(laptop);
    }
}
