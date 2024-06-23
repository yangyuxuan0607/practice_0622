package com.demo.controller;

import com.demo.domain.JobEntity;
import com.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(@RequestParam("skills") List<String> skills){
        System.out.println(skills);
//        JobEntity job = new JobEntity(1,"engineer", List.of(new String[]{"sample1", "sample2"}), List.of(new String[]{"sample1", "sample2"}));
        JobEntity job = jobService.FetchJob(skills);
        return job.getJobName();
    }
}
