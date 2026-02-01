package com.university.professor.controller;

import com.university.professor.model.Professor;
import com.university.professor.repository.ProfessorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

 private final ProfessorRepository repo;

 public ProfessorController(ProfessorRepository repo) {
  this.repo = repo;
 }

 @GetMapping
 public List<Professor> getAll() {
  return repo.findAll();
 }

 @PostMapping
 public Professor create(@RequestBody Professor professor) {
  return repo.save(professor);
 }

 @GetMapping("/{id}")
 public Professor getById(@PathVariable Long id) {
  return repo.findById(id).orElse(null);
 }
}
