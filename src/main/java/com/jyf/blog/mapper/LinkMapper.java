package com.jyf.blog.mapper;

import com.jyf.blog.entity.Link;

import java.util.List;

public interface LinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(Link record);

    int insertSelective(Link record);

    Link selectByPrimaryKey(Integer linkId);

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKey(Link record);

    List<Link> selectLinks();
}