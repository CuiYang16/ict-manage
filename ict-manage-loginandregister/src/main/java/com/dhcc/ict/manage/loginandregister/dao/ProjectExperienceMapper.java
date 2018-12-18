package com.dhcc.ict.manage.loginandregister.dao;

import com.dhcc.ict.manage.loginandregister.pojo.ProjectExperience;
import com.dhcc.ict.manage.loginandregister.pojo.ProjectExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectExperienceMapper {
    int countByExample(ProjectExperienceExample example);

    int deleteByExample(ProjectExperienceExample example);

    int deleteByPrimaryKey(Integer projectExperienceId);

    int insert(ProjectExperience record);

    int insertSelective(ProjectExperience record);

    List<ProjectExperience> selectByExample(ProjectExperienceExample example);

    ProjectExperience selectByPrimaryKey(Integer projectExperienceId);

    int updateByExampleSelective(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    int updateByExample(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    int updateByPrimaryKeySelective(ProjectExperience record);

    int updateByPrimaryKey(ProjectExperience record);
}