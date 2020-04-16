package com.jyf.blog.service.impl;

import com.jyf.blog.entity.Link;
import com.jyf.blog.mapper.LinkMapper;
import com.jyf.blog.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements LinkService {
    @Autowired
    LinkMapper linkMapper;

    @Override
    public List<Link> listLink() {
        List<Link>linkList=linkMapper.selectLinks();
        return linkList;
    }
}
