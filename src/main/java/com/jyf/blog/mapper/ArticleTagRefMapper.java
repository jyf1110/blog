package com.jyf.blog.mapper;

import com.jyf.blog.entity.ArticleTagRef;
import org.apache.ibatis.annotations.Param;

public interface ArticleTagRefMapper {
    int deleteByPrimaryKey(@Param("articleId") Integer articleId, @Param("tagId") Integer tagId);

    int insert(ArticleTagRef record);

    int insertSelective(ArticleTagRef record);
}