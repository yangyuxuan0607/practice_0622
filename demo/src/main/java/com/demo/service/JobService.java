package com.demo.service;

import com.demo.domain.JobEntity;
import com.demo.domain.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private  JobRepository jobRepository;

    public JobEntity FetchJob(List<String> skills){
        return jobRepository.fetchJob(skills);
    }
}
