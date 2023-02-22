package com.luv2code.hibernate.demo.employee;

import com.luv2code.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Chhin_Hua - 22/02
 **/

public class CreateEmployeeDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create a employee object
            System.out.println("Create new employee object...");
            Employee employee = new Employee("Paul", "Wall", "FPT Software");

            // start a transaction
            session.beginTransaction();

            // save the employee object
            System.out.println("Save employee...");
            session.save(employee);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("done~!");

        } finally {
            factory.close();
        }


    }
}
