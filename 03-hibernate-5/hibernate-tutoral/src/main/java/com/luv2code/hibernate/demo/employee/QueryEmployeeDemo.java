package com.luv2code.hibernate.demo.employee;

import com.luv2code.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * @author Chhin_Hua - 22/02
 **/

public class QueryEmployeeDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // query student
            List<Employee> theEmployees = session
                    .createQuery("from Employee")
                    .getResultList();

            // display the students
            displayEmployees(theEmployees);

            // query student lastName = "Doe"
            theEmployees = session
                    .createQuery("from Employee s where s.lastName = 'Doe'")
                    .getResultList();

            // display the students
            System.out.println("\n\nEmployee who have last name of Doe");
            displayEmployees(theEmployees);

            // query student lastName = "Doe" or firstName ="Daffy"
            theEmployees = session
                    .createQuery("from Employee s where s.lastName = 'Doe' or s.firstName = 'Daffy'")
                    .getResultList();

            // display the students
            System.out.println("\n\nEmployee who have last name of Doe or first name of Daffy");
            displayEmployees(theEmployees);

            // query student where company like '%tech'
            theEmployees = session
                    .createQuery("from Employee s where s.company like '%tech'")
                    .getResultList();

            // display the students
            System.out.println("\n\nEmployee who have email like tech");
            displayEmployees(theEmployees);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("done~!");

        } finally {
            factory.close();
        }
    }

    private static void displayEmployees(List<Employee> theEmployees) {
        for (Employee tempEmployee : theEmployees) {
            System.out.println(tempEmployee);
        }
    }
}
