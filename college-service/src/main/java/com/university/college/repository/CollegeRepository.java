package com.university.college.repository;


import com.university.college.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
