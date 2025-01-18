package com.sabbir.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Student {
    @Id
    private Integer id;
    private String name;
    private String gender;
    @ManyToMany
    private List<Laptop> laptopList;
}
