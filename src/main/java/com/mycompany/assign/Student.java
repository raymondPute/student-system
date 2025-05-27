/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assign;

/**
 *
 * @author Olive
 */


// Note: Person.java was used temporarily to compile locally, but only Student.java and StudentSystem.java are part of my submission.
public class Student extends Person {
    private final String studentId;
    private final String course;

    public Student(String name, int age, String gender, String studentId, String course) {
        super(name, age, gender);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }

    
}
