package com.jyf.blog.mapper;

import com.jyf.blog.entity.Options;

import java.util.List;

public interface OptionsMapper {
    int deleteByPrimaryKey(Integer optionId);

    int insert(Options record);

    int insertSelective(Options record);

    Options selectByPrimaryKey(Integer optionId);

    int updateByPrimaryKeySelective(Options record);

    int updateByPrimaryKey(Options record);

    Options selectOptions();
}