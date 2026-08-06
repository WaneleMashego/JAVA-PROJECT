/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wedoapp;

import ac.za.tut.bl.EmployeeManagerDB;
import ac.za.tut.entity.Employee;
import java.text.ParseException;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Wanele Mashego
 */
public class WeDoApp {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args)  throws SQLException , ParseException{
        // TODO code application logic here
        
        // declare variables
        int choice, empID;
        Employee emp;
        EmployeeManagerDB db = new EmployeeManagerDB("jdbc:derby://localhost:1527/EmployeesDB;create=true", "app", "123");
        
        choice = displayChoices();
        
        while(choice != 6)
        {
            switch(choice)
            {
            case 1:
            emp = getEmployee();
            //add
            db.add(emp);
            break;
            case 2:
            //delete
            empID = getEmployeeID();
            db.delete(empID);
            break;
            case 3:
            //update
            emp = getEmployeeToUpdate();
            db.update(emp);
           
            break;
            case 4:
            //get
            empID = getEmployeeID();
            emp = db.get(empID);
            display(emp);
            break;
            case 5:
            //get all
            List<Employee> emps = db.getAll();
            display(emps);
            break;
            default:
            System.out.println(choice + " is invalid.");
            }

        choice = displayChoices();
        
        }
        
    }


      private static int displayChoices() 
      {
          

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease select one of the following options: " + "\n" +
        "1 - add employee" + "\n" +
        "2 - delete employee" + "\n" +
        "3 - update employee" + "\n" +
        "4 - get employee" + "\n" +
        "5 - get all employee" + "\n" +
        "6 - exit" + "\n\n" +
        "Your choice: ");
        choice = sc.nextInt();
        
        return choice;
    }
    
    private static Employee getEmployee() throws ParseException
    {
        Integer empID, age;
        String name, surname, dob;
        Character gender;
        Double salary;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Please enter employee id: ");
        empID = sc.nextInt();
        System.out.print("Please enter employee name: ");
        name = sc.next();
        System.out.print("Please enter employee surname: ");
        surname = sc.next();
        System.out.print("Please enter employee gender: ");
        gender = sc.next().charAt(0);
        System.out.print("Please enter employee age: ");
        age = sc.nextInt();
        System.out.print("Please enter employee salary: ");
        salary  = sc.nextDouble();
        
        System.out.print("Please enter employee date of birth (yyyy-mm-dd): ");
        dob = sc.next();
        Date date = Date.valueOf(dob);
        
        Employee employee = new Employee(empID, name, surname, gender, age, date, salary);
        return employee;
        
    }
      
    private static int getEmployeeID()
    {
        
        
        int empID;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter employee id: ");
        empID = sc.nextInt();
        return empID;
        
    }
    
    
    private static Employee getEmployeeToUpdate()
    {
        Employee employee;
        
        Double salary;
        Integer idNo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter employee id: ");
        idNo = sc.nextInt();
        System.out.print("Please enter employee salary: ");
        salary = sc.nextDouble();
        
        System.out.print("Name: ");
         String name = sc.next();

        System.out.print("Surname: ");
        String surname = sc.next();

        System.out.print("Gender: ");
        Character gender = sc.next().charAt(0);
        
        System.out.print("Age: ");
        Integer age = sc.nextInt();
        
        System.out.print("Date of birth (yyyy-mm-dd): ");
        Date dob = Date.valueOf(sc.next());
        
        employee = new Employee(idNo ,name , surname,gender,age,dob, salary);
        
        employee.setSalary(salary);
        employee.setIdNo(idNo);
        return employee;
        
        
    }
    
    private static void display(Employee emp) 
    {
        
        System.out.println(emp + "\n");
    }
    
      
    private static void display(List<Employee> emps) 
    {
        System.out.println(emps +"\n");
    }
    
    
}

