/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.bl;

/**
 *
 * @author Wanele Mashego
 */
public class Student {
    
    private Integer studNumber;
    private String name;
    private String surname;

    public Student(int studNumber, String name, String surname) {
        this.studNumber = studNumber;
        this.name = name;
        this.surname = surname;
    }

    public int getStudentNumber() {
        return studNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" + "studentNumber=" + studNumber + ", name=" + name + ", surname=" + surname + '}';
    }
    
    
    
}
