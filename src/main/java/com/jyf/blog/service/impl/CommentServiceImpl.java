package com.jyf.blog.service.impl;

import com.jyf.blog.entity.Comment;
import com.jyf.blog.mapper.CommentMapper;
import com.jyf.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;
    @Override
    public List<Comment> listComment() {
        List<Comment>commentList=commentMapper.selectComment();
        return commentList;
    }
}
