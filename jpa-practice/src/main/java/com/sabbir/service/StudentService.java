package com.sabbir.service;

import com.sabbir.model.Laptop;
import com.sabbir.model.Student;
import com.sabbir.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    // StudentRepository is an interface class and we know we can not create
    // object of an abstract / interface class. then how is it happening?
    // upcasting -> creating object of child class but casting to the abstract / interface class
    private final StudentRepository studentRepository;
    private final LaptopService laptopService;
    public StudentService(StudentRepository studentRepository, LaptopService laptopService) {
        this.studentRepository = studentRepository;
        this.laptopService = laptopService;
    }

    public List<Student> getStudentsFromDb() {
        return studentRepository.findAll();
    }

    public Student getByID(Integer id) {
        Optional<Student> st = studentRepository.findById(id);
        return st.orElse(null);
    }

    public void saveStudentInDB (Student student){
        List<Laptop> laptopFromDB = new ArrayList<>();
        if(student.getLaptopList() == null) {
            System.out.println("ok");
        }
        if(student.getLaptopList() != null) {
            for (Laptop laptop : student.getLaptopList()) {
                laptopFromDB.add(laptopService.getByID(laptop.getId()));
            }
            student.setLaptopList(laptopFromDB);
            System.out.println(laptopFromDB);
        }
        studentRepository.save(student);
    }

    public List<Student> getByGender(String gender) {
        return studentRepository.getByGender(gender);
    }
}
