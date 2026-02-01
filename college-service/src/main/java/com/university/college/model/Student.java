package com.university.college.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String first_name;

    private String last_name;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;

    private LocalDate date_of_birth;


    private String gender;   // MALE, FEMALE, OTHER

    @Column(unique = true, nullable = false)
    private String enrollment_number;

    private LocalDate admission_date;

    private Integer semester;

    private Double cgpa;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

}
