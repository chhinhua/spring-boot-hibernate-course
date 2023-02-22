package com.luv2code.hibernate.demo.employee;

import com.luv2code.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Chhin_Hua - 22/02
 **/

public class DeleteEmployeeDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            int employeeId = 2;

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // retrieve employee based on the id: primary key
            System.out.println("\nGetting employee with id: " + employeeId);
            Employee myEmployee = session.get(Employee.class, employeeId);

            // detele employee
            /*System.out.println("deleting employee: " + myEmployee);
            session.delete(myEmployee);*/

            // delete employee where id = employeeId
            System.out.println("Deleting employee where id: " + employeeId);
            session.createQuery("delete from Employee where id = 2")
                    .executeUpdate();

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
