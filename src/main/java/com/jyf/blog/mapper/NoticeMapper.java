package com.jyf.blog.mapper;


import com.jyf.blog.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyanzhao
 */
@Mapper
public interface NoticeMapper {




    List<Notice> selectNotice();
}