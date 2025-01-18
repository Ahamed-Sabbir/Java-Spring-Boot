package com.sabbir.service;

import com.sabbir.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final JdbcTemplate jdbcTemplate;

    public StudentService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
     public void saveStudentInDB(Student student){
        String sql = "insert into students values (?, ?, ?)";
        jdbcTemplate.update(sql, student.getId(), student.getName(), student.getGender());
     }

     public String getStudentNameById(Integer id){
        String sql = "select name from students where id = ?";
        return jdbcTemplate.queryForObject(sql, String.class, id);
     }

     public Student getStudentFromDb (Integer id) {
        String sql = "select * from students where id = ?";
        return jdbcTemplate.queryForObject(sql, (result, rowNum) -> {
            Student student = new Student();
            student.setId(result.getInt("id"));
            student.setName(result.getString("name"));
            student.setGender(result.getString("gender"));
            return student;
        } ,id);
     }

    public List<Student> getAllStudentFromDb () {
        String sql = "select * from students";
        return jdbcTemplate.query(sql, (result, rowNum) -> {
            Student student = new Student();
            student.setId(result.getInt("id"));
            student.setName(result.getString("name"));
            student.setGender(result.getString("gender"));
            return student;
        });
    }
}
