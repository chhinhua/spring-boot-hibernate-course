package com.luv2code.springdemo.service;

import com.luv2code.springdemo.entity.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerService {


    public void saveCustomer(Customer customer);

    List<Customer> getCustomers(int theSortField);

    Customer getCustomer(int id);

    void deleteCustomer(int id);

    List<Customer> searchCustomers(String theSearchName);


}
