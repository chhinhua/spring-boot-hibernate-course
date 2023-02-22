package com.luv2code.hibernate.demo.employee;

import com.luv2code.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Chhin_Hua - 22/02
 **/

public class UpdateEmployeeDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            int employeeId = 1;

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // retrieve employee based on the id: primary key
            System.out.println("\nGetting employee with id: " + employeeId);
            Employee myEmployee = session.get(Employee.class, employeeId);

            System.out.println("Update employee ....");
            myEmployee.setFirstName("Scooby");

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

            // NEW CODE

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // update email for all employee
            System.out.println("Update company for all employee");
            session.createQuery("update Employee set company='FPT Software'")
                    .executeUpdate();

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");


        } finally {
            factory.close();
        }
    }
}
