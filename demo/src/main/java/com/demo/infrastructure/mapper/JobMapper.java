package com.demo.infrastructure.mapper;

import com.demo.domain.JobEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JobMapper {
    JobEntity fetchJob(@Param("skills") List<String> skills);
}
