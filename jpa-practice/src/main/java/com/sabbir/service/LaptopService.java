package com.sabbir.service;

import com.sabbir.model.Laptop;
import com.sabbir.model.Student;
import com.sabbir.repository.LaptopRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LaptopService {
    private final LaptopRepository laptopRepository;
    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public void addLaptopInDB (Laptop laptop) {
        laptopRepository.save(laptop);
    }

    public Laptop getByID(Integer id) {
        Optional<Laptop> st = laptopRepository.findById(id);
        return st.orElse(null);
    }
}
