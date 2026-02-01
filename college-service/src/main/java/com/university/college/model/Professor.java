package com.university.college.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "professor")
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String employee_id;

    private String first_name;
    private String last_name;

    private String designation;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    private String specialization;
    private String highest_qualification;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    private String email;
    private String phone;

    private LocalDate joining_date;
    private int experience_years;

    private String status; // ACTIVE, ON_LEAVE, RETIRED

}
