package com.sabbir.repository;
// repository will always be an interface class

import com.sabbir.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
