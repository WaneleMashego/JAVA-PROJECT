/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 // Use the correct package for StudentDB

package daoapp;

import ac.za.tut.bl.Student;

/**
 *
 * @author Wanele Mashego
 */
public class DAOApp {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    try {
        String dbURL = "jdbc:derby://localhost:1527/StudentDB";
        String username = "app";
        String password = "app";

        StudentDB dao = new StudentDB(dbURL, username, password);

        Student student = new Student(1001, "Wanele", "Mashego");

        boolean added = dao.add(student);

        if (added) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student was not added.");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

        
}
    

