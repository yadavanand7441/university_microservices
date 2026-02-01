package com.university.college.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "department")
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String department_name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Professor> professors;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

}
