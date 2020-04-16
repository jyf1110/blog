package com.jyf.blog.service.impl;


import com.jyf.blog.entity.Notice;
import com.jyf.blog.mapper.NoticeMapper;
import com.jyf.blog.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyanzhao
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired(required = false)
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> listNotice()  {
        return noticeMapper.selectNotice();
    }


}
