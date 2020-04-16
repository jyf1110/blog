package com.jyf.blog.service.impl;

import com.jyf.blog.entity.Tag;
import com.jyf.blog.mapper.TagMapper;
import com.jyf.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    TagMapper tagMapper;
    @Override
    public List<Tag> listTag() {
        List<Tag> tagList=tagMapper.selectTag();
        return tagList;
    }
}
