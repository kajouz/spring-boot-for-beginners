package com.example.alibouspringdemo.Student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;

    private String lastname;

    private LocalDate dateOfBirth;

    @Column(unique = true)
    private String email;

    private int age;

    public int getAge(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();

    }
}
