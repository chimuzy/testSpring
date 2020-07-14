package com.zyigeek.d04_annotation.dao;

public class EmpDao implements IDao{
    @Override
    public void select(){
        System.out.println("EmpDao.select()...");
    }
}
