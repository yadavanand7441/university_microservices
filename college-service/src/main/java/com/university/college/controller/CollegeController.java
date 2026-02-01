package com.university.college.controller;

import com.university.college.model.College;
import com.university.college.repository.CollegeRepository;
import com.university.college.service.impl.CollegeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/university/microservices/college")
public class CollegeController {

    private static Logger logger = LoggerFactory.getLogger(CollegeController.class);
    private CollegeServiceImpl collegeServiceImpl;

    @Autowired
    public CollegeController(CollegeServiceImpl collegeServiceImpl) {
        this.collegeServiceImpl = collegeServiceImpl;
    }

    @PostMapping("/save_single_college_data")
    public ResponseEntity<College>addCollegeDataIntoDataBase(@RequestBody College college)
    {
        College collegeData = collegeServiceImpl.addCollegeData(college);
        logger.info("college data added successfully into database !");
        return ResponseEntity.ok(collegeData);
    }
}
