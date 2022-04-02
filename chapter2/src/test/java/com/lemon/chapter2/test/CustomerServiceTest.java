package com.lemon.chapter2.test;

import com.lemon.chapter2.service.CustomerService;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lemoon on 2022/4/2 11:32 PM
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init(){
        //TODO 初始化数据库
    }


}
