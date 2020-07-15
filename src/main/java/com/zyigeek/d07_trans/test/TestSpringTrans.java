package com.zyigeek.d07_trans.test;

import com.zyigeek.d07_trans.dao.IBookShopDao;
import com.zyigeek.d07_trans.exception.AccountException;
import com.zyigeek.d07_trans.exception.BookStockException;
import com.zyigeek.d07_trans.service.IBookShopService;
import com.zyigeek.d07_trans.service.ICashierService;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestSpringTrans {

    private ApplicationContext ac;
    private IBookShopDao bookShopDao;
    private IBookShopService bookShopService;
    private ICashierService cashierService;

    {
        ac = new ClassPathXmlApplicationContext("beans_trans.xml");
        bookShopDao = (IBookShopDao)ac.getBean("bookShopDao");
        bookShopService = (IBookShopService)ac.getBean("bookShopService");
        cashierService = (ICashierService)ac.getBean("cashierService");
    }

    @Test
    public void testSelectPrice() {
        int price = bookShopDao.selectPrice(1);
        System.out.println(price);
    }

    @Test
    public void testUpdateStock() throws BookStockException {
        bookShopDao.updateStock(1);
    }

    @Test
    public void testUpdateBalance() throws AccountException {
        bookShopDao.updateBalance("zs", 40);
    }

    @Test
    public void testPurchase() throws AccountException, BookStockException {
        //未添加事务管理：可能会出现一个情况,当余额不足时购买书,将购买失败，余额没变,但库存依旧减少
        bookShopService.purchase("zs", 1);
    }

    @Test
    public void testCash() throws AccountException, BookStockException {
        //可能会出现一种情况,当余额不足购买所有书时,会事务回滚,一本书都买不成功
        cashierService.cash("zs", Arrays.asList(1,2));
    }
}