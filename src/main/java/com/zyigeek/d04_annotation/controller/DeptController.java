package com.zyigeek.d04_annotation.controller;

import com.zyigeek.d04_annotation.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller标注当前类是一个控制类
@Controller
public class DeptController {

    //@Autowired按照类型直接自动装配，在IOC容器中查找
    @Autowired
    private DeptService deptService;
    public void find(){
        deptService.selectOne();
        System.out.println("DeptController.find()...");
    }
}

