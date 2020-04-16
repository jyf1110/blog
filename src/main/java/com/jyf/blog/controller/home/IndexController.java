package com.jyf.blog.controller.home;

import com.jyf.blog.entity.*;
import com.jyf.blog.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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


    @RequestMapping(value = {"/", "/article"})
    public String index(ModelMap modelMap){
        List<Notice> noticeList=noticeService.listNotice();
        modelMap.put("noticeList",noticeList);
        List<Link> linkList=linkService.listLink();
        modelMap.put("linkList",linkList);
        Options options=optionsService.listOption();
        modelMap.put("options",options);
        List<Tag> allTagList=tagService.listTag();
        modelMap.put("allTagList",allTagList);
        List<Comment> recentCommentList=commentService.listComment();
        modelMap.put("recentCommentList",recentCommentList);
        return "Home/index";

    }
}
