package com.luv2code.springdemo.controller;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Chhin_Hua - 28/02
 **/

@Controller
@RequestMapping
public class CustomerController {

    // need to inject customer dao
    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("")
    public String listCustomers(Model model) {

        // get customers from the dao
        List<Customer> theCustomers = customerDAO.getCustomers();

        // add the customers to the model
        model.addAttribute("customers", theCustomers);

        return "list-customers";
    }
}
