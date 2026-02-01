package com.university.college.service.impl;

import com.netflix.discovery.converters.Auto;
import com.university.college.model.College;
import com.university.college.repository.CollegeRepository;
import com.university.college.service.ICollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements ICollegeService {

    private CollegeRepository collegeRepository;

    @Autowired
    public CollegeServiceImpl(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    @Override
    public College addCollegeData(College college) {
        College singleCollegeData = collegeRepository.save(college);
        return singleCollegeData;
    }

    @Override
    public List<College> getAllCollegeDetails() {
        return null;
    }
}
