package com.demo.domain;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository {
    public JobEntity fetchJob(List<String> skills);
}
