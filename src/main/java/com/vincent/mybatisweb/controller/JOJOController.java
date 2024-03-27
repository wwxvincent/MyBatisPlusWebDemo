package com.vincent.mybatisweb.controller;

import com.vincent.mybatisweb.entity.jojo;
import com.vincent.mybatisweb.mapper.JOJOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//把后段的数据流返回给前端
@CrossOrigin
public class JOJOController {

    @Autowired
    JOJOMapper jojoMapper;

    @RequestMapping("/insert")
    public String insert(String name, Integer age) {
        return jojoMapper.insert(new jojo(name, age)) > 0 ? "success!" : "fail!";
    }
    @RequestMapping("/select1")
    public List<jojo> select1() {
        return jojoMapper.selectList(null);
    }
    @RequestMapping("/select2")
    public jojo select2() {
        return jojoMapper.select2();
    }
}
