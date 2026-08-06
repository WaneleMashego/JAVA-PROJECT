/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.bl;

import java.sql.ResultSet;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import ac.za.tut.entity.Employee;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wanele Mashego
 */
public class EmployeeManagerDB implements DAOInterface<Employee> {

   private Connection connection;

    public EmployeeManagerDB(String dbURL,String username,String password) throws SQLException {
        connection = getConnection(dbURL,username,password);
    }
   
    
    
    @Override
    public Employee get(Integer id) {
        
        String sql = "SELECT  idNo,name,surname,gender,age,dob,salary" 
                + " FROM EmployeesTBL "
                + " WHERE idNo = ?";       
        
        try
        {
          
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
       
            if(rs.next())
            {
                Integer idNo = rs.getInt("idNo");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Character gender = rs.getString("gender").charAt(0);
                Integer age = rs.getInt("age");
                Date dob = rs.getDate("dob");
                Double salary = rs.getDouble("salary");
                
                Employee employee = new Employee( idNo,name,surname,gender,age,dob,salary);
                
                rs.close();
                ps.close();
                
                return employee;
            }
            else
            {
                rs.close();
                ps.close();
                
                return null;
            }
            
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
            return null;
        }
        
    }

    @Override
    public boolean add(Employee t) {
        
        String sql = " INSERT INTO EmployeeTBL (idNo,name,surname,gender,age,dob,salary) "
                + "VALUES (?,?,?,?,?,?,?)";
        
       try
       {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, t.getIdNo());
            ps.setString(2, t.getName());
            ps.setString(3, t.getSurname());
            ps.setString(4, t.getGender().toString());
            ps.setInt(5, t.getAge());
            ps.setDate(6, (Date) t.getDob());
            ps.setDouble(7, t.getSalary());
            
            ps.executeUpdate();
            
            ps.close();
            
            return true;
           
       }
        catch( SQLException ex)
        {
           System.err.println(ex);
            return false;
        }
        
        
        
    }

    @Override
    public boolean delete(Integer id) {
       
        String sql = "DELETE FROM EmployeesTBL "
                + "WHERE idNo = ?";
        
        try
        {
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.executeUpdate();
            
            ps.close();
            return true;
        }
        catch (SQLException ex  )
        {
            System.err.println(ex);
            return false;
        }
        
    }

    @Override
    public boolean update(Employee t) {
       
        String sql = " UPDATE EmployeesTBL SET "
                + "salary = ? "
                + "WHERE idNo = ?";
        
        try
        {
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setDouble(1, t.getSalary());
            ps.setInt(2,t.getIdNo());
            
            ps.executeUpdate();
            ps.close();
            
            return true;
        }
        catch(SQLException ex )
        {
            System.err.println(ex);
            return false;
        }
        
    }

    @Override
    public List getAll() {
       
        List<Employee> employees = new ArrayList<>();
        
        String sql = " SELECT  * FROM EmployeesTBL" 
                + " ORDER BY idNo ASC";
        
        
        try
        {
            
            PreparedStatement ps  = connection.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                
                Integer idNo = rs.getInt("idNo");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Character gender = rs.getString("gender").charAt(0);
                Integer age = rs.getInt("age");
                Date dob = rs.getDate("dob");
                Double salary = rs.getDouble("salary");
                
                
                
                Employee employee = new Employee(idNo,name,surname,gender,age,dob,salary);
                
                employees.add(employee);
                
                rs.close();
                ps.close();
                
                
            }
            return employees;
            
        }
        catch (SQLException ex)
        {
            System.err.println(ex);
            return null;
        }
        
    }

    private Connection getConnection(String dbURL,String username,String password) throws SQLException
    {
        Connection theConnection = DriverManager.getConnection(dbURL,username,password);
        return theConnection;
    }
    
    
}
