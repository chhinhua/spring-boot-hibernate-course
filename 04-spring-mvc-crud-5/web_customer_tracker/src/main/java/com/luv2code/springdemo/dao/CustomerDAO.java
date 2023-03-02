package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.Customer;

import java.util.List;

/**
 * @author Chhin_Hua - 01/03
 **/

public interface CustomerDAO {

    public List<Customer> getCustomers();

}
