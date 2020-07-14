package com.zyigeek.d07_trans.service;

import com.zyigeek.d07_trans.exception.AccountException;
import com.zyigeek.d07_trans.exception.BookStockException;

import java.util.List;

public interface ICashierService {

    //客户的结账
    public void cash(String username, List<Integer> bookIds) throws AccountException, BookStockException;
}