/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ac.za.tut.bl;

import java.sql.SQLException;
import ac.za.tut.entity.Employee;
import java.util.List;

/**
 *
 * @author Wanele Mashego
 * @param <T>
 */
public interface DAOInterface<T>  {
    
    public  T get(Integer id) throws SQLException ;
    public boolean add(T t) throws SQLException;
    public boolean delete(Integer id) throws SQLException;
    public boolean update(T t) throws SQLException;        
    public List<T> getAll()throws SQLException;
    
    
}
