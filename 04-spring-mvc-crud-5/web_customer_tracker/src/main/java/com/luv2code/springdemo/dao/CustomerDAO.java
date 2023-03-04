package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.Customer;

import java.util.List;

/**
 * @author Chhin_Hua - 01/03
 **/

public interface CustomerDAO {

    List<Customer> getCustomers(int theSortField);

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);

    List<Customer> searchCustomers(String theSearchName);
}
