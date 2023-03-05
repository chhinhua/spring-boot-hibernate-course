package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * @author Chhin_Hua - 05/03
 **/

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println(getClass() + ":Doing my db work: adding an account");
    }
}
