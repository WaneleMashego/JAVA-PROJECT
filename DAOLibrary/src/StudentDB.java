
import ac.za.tut.bl.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wanele Mashego
 */
public class StudentDB implements DAO<Student>{
    
    private Connection connection;

    public StudentDB(String dbURL,String username,String password ) throws SQLException {
        connection = getConnection(dbURL,username,password);
    }
    
    @Override
    public boolean add(Student t) {
        
        String sql = "INSERT INTO StudentsTBL (StudentNumber,Name,Surname) " + "VALUES (?,?,? )";
        
        try
        {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1 ,t.getStudentNumber());
            ps.setString(2,t.getName());
            ps.setString(3,t.getSurname());
            return true;
            
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
            return false;
        }
                        
                
    }

    @Override
    public Student get(Integer code) {
       
        ResultSet rs;
        
        String sql = "SELECT studentNmber,Name,Surname " + "FROM StudentsTBL " + "WHERE StudentNumber =?";
        
        try
        {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, code);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                int studNum = rs.getInt("StudentNumber");
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                
                Student student = new Student(studNum,name,surname);
                rs.close();
                return student;
                             
            }
            else
            {
                rs.close();
                return null;
            }
            
        }
        catch (SQLException ex)
        {
           ex.printStackTrace();
           return null;
        }
        
       
    }

    @Override
    public List<Student> getAll() {
       
        List<Student> students = new ArrayList<>();
        
        String sql = "SELECT FROM StudentsTBL " + "ORDER BY StudentNumber ASC";
        
        try
        {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                
                Integer studNum = rs.getInt("StudentNumber");
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                
                Student student = new Student(studNum,name,surname);
                
                students.add(student);
                
            }
            return students;
            
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
            return null;
        }
      
    }

    @Override
    public boolean delete(Student t) {
       
        String sql = "DELETE FROM StudentsTBL " +
                "WHERE studentNumber =?";
        
        try
        {
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, t.getStudentNumber());
            ps.executeUpdate();
            
            return true;
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
            return false;
        }
        
    }

    @Override
    public boolean update(Student t) {
        
        String sql = "UPDATE FROM StudentsTBL " +
                "SET studentNumber =? ,Name =? , Surname =?";
        
        try
        {
            
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, t.getStudentNumber());
            ps.setString(1 , t.getName());
            ps.setString(1,t.getSurname());
            ps.executeUpdate();
            
            return true;
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
            return false;
        }
        
        
    }
    
    
    private Connection getConnection(String dbURL,String username,String password) throws SQLException
    {
        Connection theConnection = DriverManager.getConnection(dbURL,username,password);
        return theConnection;
    }
    
}
