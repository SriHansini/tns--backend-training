package com.tnsif.EncapsulationDemo;

public class StudentMain {
    public static void main(String[] args) {
        Student p = new Student();

        // Set values using setters
        p.setName("Honey");
        p.setRollno(25);

        // Get values using getters
        System.out.println("Name: " + p.getName());
        System.out.println("Roll No: " + p.getRollno());
    }
}

