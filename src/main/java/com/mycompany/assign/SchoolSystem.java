/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assign;

/**
 *
 * @author RAY D
 */
public class SchoolSystem {

    public static void main(String[] args) {
        Person p = new Person("Olive Chimphepo", 19 , "Female");
        p.displayDetails();
        
        Student s = new Student("Olive Chimphepo", 19, "Female", "BScICT/22/061", "ICT");
        s.displayDetails();
    }
}
