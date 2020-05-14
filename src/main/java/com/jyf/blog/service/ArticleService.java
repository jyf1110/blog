package com.jyf.blog.service;

import com.github.pagehelper.PageInfo;
import com.jyf.blog.entity.Article;

import java.util.Map;

public interface ArticleService {
    PageInfo<Article> listArticle(Integer pageIndex, Integer pageNumber, Map<String, Object> map);
}
