package com.jyf.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jyf.blog.entity.Article;
import com.jyf.blog.entity.Category;
import com.jyf.blog.mapper.ArticleMapper;
import com.jyf.blog.mapper.CategoryMapper;
import com.jyf.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    CategoryMapper categoryMapper;


    @Override
    public PageInfo<Article> listArticle(Integer pageIndex, Integer pageSize, Map<String, Object> map) {

        //找出所有文章
        PageHelper.startPage(pageIndex,pageSize);

        List<Article> articleList=articleMapper.selectAllArticle(map);

        //封装每篇文章的category
        int articleId;
        Article article=null;
        for(int i=0;i<articleList.size();i++){
            article=articleList.get(i);
            articleId=article.getArticleId();
           List<Category>categoryList=categoryMapper.findAllByArticleId(articleId);
           if(categoryList.size()==0||categoryList ==null){
               categoryList=new ArrayList<>();
               categoryList.add(Category.Default());
           }
           article.setCategoryList(categoryList);

        }

        return new PageInfo<>(articleList);
    }
}
