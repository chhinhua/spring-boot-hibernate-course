package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Chhin_Hua - 21/02
 **/

public class PrimaryKeyDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create a student object
            System.out.println("Create new student object...");
            Student student1 = new Student("John", "Doe", "jonh@luv2code.com");
            Student student2 = new Student("Mary", "Public", "mary@luv2code.com");
            Student student3 = new Student("Bonita", "Applebaum", "bonita@luv2code.com");

            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Save student...");
            session.save(student1);
            session.save(student2);
            session.save(student3);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("done~!");
        } finally {
            factory.close();
        }


    }
}
