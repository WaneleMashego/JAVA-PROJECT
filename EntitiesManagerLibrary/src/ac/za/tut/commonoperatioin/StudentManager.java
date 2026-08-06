/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.commonoperatioin;

import ac.za.tut.student.Student;
import java.util.ArrayList;

/**
 *
 * @author Wanele Mashego
 */
public class StudentManager implements CommonOperation<Student> {

    ArrayList<Student> students;

    public StudentManager()
    {
        students = new ArrayList<>();
    }
    
    
    @Override
    public boolean add(Student t) {
        
        students.add(t);
        return true;
    }

    @Override
    public Student get(Student t) {
        
        if(students.contains(t))
        {
            return students.get(students.indexOf(t));
        }
        else
        {
            return null;
        }
    }

    @Override
    public ArrayList<Student> getAll() {
       
      if(students.isEmpty())
      {
          return null;
      }
      else
      {
          return students;
      }
      
    }

    @Override
    public boolean delete(Student t) {
        
        if(students.remove(t))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }

    @Override
    public boolean update(Student t) {
       
        if(students.contains(t))
        {
            int index = students.indexOf(t);
            students.set(index, t);
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
}
