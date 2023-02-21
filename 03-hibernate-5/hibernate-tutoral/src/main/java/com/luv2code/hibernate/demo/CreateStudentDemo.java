package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

/**
 * @author Chhin_Hua - 21/02
 **/

public class CreateStudentDemo {

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
            Student student = new Student("Paul", "Wall", "paul@gmail.com");

            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Save student...");
            session.save(student);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("done~!");
        } finally {
            session.close();
            factory.close();
        }


    }
}
