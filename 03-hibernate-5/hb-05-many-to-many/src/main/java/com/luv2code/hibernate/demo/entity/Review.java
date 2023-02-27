package com.luv2code.hibernate.demo.entity;

import javax.persistence.*;

/**
 * @author Chhin_Hua - 27/02
 **/

@Entity
@Table(name = "review")
public class Review {

    // define fields

    // define constructor

    // define getter/setter

    // define toString

    // define annotation fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "comment")
    private String comment;

    public Review() {
    }

    public Review(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                '}';
    }

}

