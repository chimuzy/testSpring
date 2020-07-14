package com.zyigeek.d04_annotation.dao;

import org.springframework.stereotype.Repository;

//@Repository标注当前类是一个持久层，完成数据操作，添加至IOC容器中
//当前若提供value属性，则在IOc容器中此实例的id将是value的值
//若没有指定value，则按照当前类名的首字母小写来作为id
@Repository(value = "deptDao")
public class DeptDao implements IDao {

    @Override
    public void select(){
        System.out.println("DeptDao.select()...");
    }
}
