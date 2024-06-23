package com.demo.infrastructure.repository;

import com.demo.domain.JobEntity;
import com.demo.domain.JobRepository;
import com.demo.infrastructure.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobRepositoryDb implements JobRepository {
    @Autowired
    private JobMapper jobMapper;

    @Override
    public JobEntity fetchJob(List<String> skills) {
        return jobMapper.fetchJob(skills);
    }
}
