package com.jyf.blog.mapper;

import com.jyf.blog.entity.ArticleCategoryRef;

public interface ArticleCategoryRefMapper {
    int insert(ArticleCategoryRef record);

    int insertSelective(ArticleCategoryRef record);
}