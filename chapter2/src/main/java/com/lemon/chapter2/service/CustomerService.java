package com.lemon.chapter2.service;

import com.lemon.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 * Created by lemoon on 2022/4/1 8:32 PM
 */
public class CustomerService {

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(String keyword){
        //TODO
        return null;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id){
        //TODO
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id){
        //TODO
        return false;
    }
}
