package com.jyf.blog.controller.home;

import com.github.pagehelper.PageInfo;
import com.jyf.blog.entity.*;
import com.jyf.blog.enums.ArticleStatus;
import com.jyf.blog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    NoticeService noticeService;
    @Autowired
    LinkService linkService;
    @Autowired
    OptionsService optionsService;
    @Autowired
    TagService tagService;
    @Autowired
    CommentService commentService;
    @Autowired
    ArticleService articleService;


    @RequestMapping(value = {"/", "/article"})
    public String index(@RequestParam(required = false,defaultValue = "1")Integer pageIndex,
                        @RequestParam(required = false,defaultValue = "10")Integer pageSize,
            ModelMap modelMap){
        //文章
        Map<String,Object> map=new HashMap<>();
        map.put("status", ArticleStatus.PUBLISH.getValue());
        PageInfo<Article>articlePageInfo=articleService.listArticle(pageIndex,pageSize,map);
        modelMap.put("pageInfo",articlePageInfo);

        //通知
        List<Notice> noticeList=noticeService.listNotice();
        modelMap.put("noticeList",noticeList);
        //链接
        List<Link> linkList=linkService.listLink();
        modelMap.put("linkList",linkList);
        //标签
        List<Tag> allTagList=tagService.listTag();
        modelMap.put("allTagList",allTagList);
        //最新评论
        List<Comment> recentCommentList=commentService.listComment();
        modelMap.put("recentCommentList",recentCommentList);
        return "Home/index";

    }
}
