package com.demo.domain;

import lombok.Data;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

@Data
public class JobEntity {
    private final Integer jobId;
    private final String jobName;
    private final String jobUrls;
    private final String jobSkills;
}
