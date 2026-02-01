package com.university.student.controller;

import com.university.student.entity.Student;
import com.university.student.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

 private final StudentRepository repo;
 private final RestTemplate restTemplate;

 public StudentController(StudentRepository repo, RestTemplate restTemplate) {
  this.repo = repo;
  this.restTemplate = restTemplate;
 }

 @GetMapping
 public List<Student> getAll() {
  return repo.findAll();
 }

 @PostMapping
 public Student create(@RequestBody Student student) {
  return repo.save(student);
 }

 @GetMapping("/{id}")
 public Student getById(@PathVariable Long id) {
  return repo.findById(id).orElse(null);
 }

 // Example of inter-service call: fetch professor details for a student
 @GetMapping("/{id}/professor")
 public Object getProfessorForStudent(@PathVariable Long id) {
  Student student = repo.findById(id).orElse(null);
  if (student == null) return null;

  String url = "http://PROFESSOR-SERVICE/professor/" + student.getProfessorId();
  return restTemplate.getForObject(url, Object.class);
 }
}
