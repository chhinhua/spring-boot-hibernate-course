package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Chhin_Hua - 21/02
 **/

public class ReadStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create a student object
            System.out.println("Create new student object...");
            Student student = new Student("Daffy", "Duck", "daffy@gmail.com");

            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Save student...");
            System.out.println(student);
            session.save(student);

            // commit transaction
            session.getTransaction().commit();
            System.out.println("done~!");

            // MY NEW CODE

            // find out the student's id: primary key
            System.out.println("Saved student: Generated id: " + student.getId());

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // retrieve student based on the id: primary key
            System.out.println("\nGetting student with id: " + student.getId());
            Student myStudent = session.get(Student.class, student.getId());
            System.out.println("Get completed: " + myStudent);

            // commit the transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }


    }
}
