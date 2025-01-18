package com.sabbir.repository;
// repository will always be an interface class

import com.sabbir.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> getByGender(String gender);
}
