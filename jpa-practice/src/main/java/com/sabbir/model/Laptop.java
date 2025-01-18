package com.sabbir.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Laptop {
    @Id
    private Integer id;
    private String brand;
}
