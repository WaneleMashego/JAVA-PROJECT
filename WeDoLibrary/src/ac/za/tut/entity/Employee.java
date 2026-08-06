/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.entity;

import java.util.Date;

/**
 *
 * @author Wanele Mashego
 */
public class Employee {
    
    private Integer IdNo;
    private String name;
    private String surname;
    private Character gender;
    private Integer age;
    private Date dob;
    private boolean isMarried;
    private Double salary;

    public Employee(Integer IdNo, String name, String surname, Character gender, Integer age, Date dob, Double salary) {
        this.IdNo = IdNo;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
        this.salary = salary;
    }

    public Integer getIdNo() {
        return IdNo;
    }

    public void setIdNo(Integer IdNo) {
        this.IdNo = IdNo;
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

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "IdNo=" + IdNo + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", age=" + age + ", dob=" + dob + ", salary=" + salary + '}';
    }
    
    
    
}
