package com.zyigeek.d04_annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDao implements IDao{
    @Override
    public void select(){
        System.out.println("EmpDao.select()...");
    }
}
