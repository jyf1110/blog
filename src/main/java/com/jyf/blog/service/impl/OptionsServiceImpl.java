package com.jyf.blog.service.impl;

import com.jyf.blog.entity.Options;
import com.jyf.blog.mapper.OptionsMapper;
import com.jyf.blog.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

 @Service
public class OptionsServiceImpl implements OptionsService {
     @Autowired
     OptionsMapper optionsMapper;

    @Override
    public Options listOption() {
        Options optionsList=optionsMapper.selectOptions();
        return optionsList;
    }
}
