package com.university.professor.repository;

import com.university.professor.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
