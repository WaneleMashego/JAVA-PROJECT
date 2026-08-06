
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Wanele Mashego
 */
public interface DAO<T> {
    
    boolean add(T t);
    T get(Integer code);
    List<T> getAll();
    boolean delete(T t);
    boolean update(T t);
    
    
    
}
