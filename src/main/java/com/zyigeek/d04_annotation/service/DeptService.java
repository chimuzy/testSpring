package com.zyigeek.d04_annotation.service;

import com.zyigeek.d04_annotation.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service标注当前类是一个业务逻辑类,添加至IOC容器中
@Service
public class DeptService {

    //@Autowired 按照类型自动装配,在IOC容器中查找，若在IOC容器中出现匹配类型不唯一，则辉报错
    @Autowired
    private IDao dao;

    public void selectOne(){
        dao.select();
        System.out.println("DeptService.selectOne()...");
    }
}
