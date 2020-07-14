package com.zyigeek.d07_trans.service;

import com.zyigeek.d07_trans.exception.AccountException;
import com.zyigeek.d07_trans.exception.BookStockException;

public interface IBookShopService {

    //通过账户名及书号购买书
    public void purchase(String username, int bookId) throws BookStockException, AccountException;
}
