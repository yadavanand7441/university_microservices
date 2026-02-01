package com.university.college.service;

import com.university.college.model.College;

import java.util.List;

public interface ICollegeService {

    College addCollegeData(College college);

    List<College> getAllCollegeDetails();
}
