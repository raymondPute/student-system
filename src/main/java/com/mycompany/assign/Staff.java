package com.mycompany.assign;

public class Staff extends Person {
    private String staffId;
    private String department;

    public Staff(String name, int age, String gender, String staffId, String department) {
        super(name, age, gender);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}