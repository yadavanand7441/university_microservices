package com.university.college.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "college")
public class College implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long college_id;

    private String college_name;

    private String college_location;

    private Integer established_year;

    @Enumerated(EnumType.STRING)
    private CollegeType college_type;

    private String affiliation;

    private String contact_email;

    private String contact_phone;

    private String website;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Department> departments;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Professor> professors;

}
