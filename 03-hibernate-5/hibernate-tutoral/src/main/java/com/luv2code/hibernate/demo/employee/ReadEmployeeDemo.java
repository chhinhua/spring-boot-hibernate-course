package com.luv2code.hibernate.demo.employee;

import com.luv2code.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Chhin_Hua - 22/02
 **/

public class ReadEmployeeDemo {
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
            Employee employee = new Employee("Daffy", "Duck", "FPT Software");

            // start a transaction
            session.beginTransaction();

            // save the employee object
            System.out.println("Save employee...");
            System.out.println(employee);
            session.save(employee);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("done~!");

            // MY NEW CODE

            // find out the employee's id: primary key
            System.out.println("Saved employee: Generated id: " + employee.getId());

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // retrieve employee based on the id: primary key
            System.out.println("\nGetting employee with id: " + employee.getId());
            Employee myEmployee = session.get(Employee.class, employee.getId());
            System.out.println("Get completed: " + myEmployee);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }

    }
}

