package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Chhin_Hua - 21/02
 **/

public class DeleteStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            int studentId = 3;

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // retrieve student based on the id: primary key
            System.out.println("\nGetting student with id: " + studentId);
            Student myStudent = session.get(Student.class, studentId);
/*
            // delete the student
            System.out.println("deleting student: " +myStudent);
            session.delete(myStudent);*/

            // delete student have id = 2
            System.out.println("deleting student where id = 2: " + myStudent);
            session.createQuery("delete from Student where id = 2");

            // commit the transaction
            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }


    }
}
