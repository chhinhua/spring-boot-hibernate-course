package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Chhin_Hua - 01/03
 **/

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    // need to inject the session factory
    private final SessionFactory sessionFactory;

    public CustomerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Customer> getCustomers() {

        // get the current hibernate transaction
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query ... sort by last name
        Query<Customer> theQuery =
                currentSession.createQuery("from Customer order by lastName", Customer.class);

        // execute query and get result list
        List<Customer> customers = theQuery.getResultList();

        // return the result
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {

        // get the current hibernate transaction
        Session currentSession = sessionFactory.getCurrentSession();

        // save customer
        currentSession.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomers(int id) {

        // get the current hibernate transaction
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Customer customer = currentSession.get(Customer.class, id );

        // return the result
        return customer;

    }


}
