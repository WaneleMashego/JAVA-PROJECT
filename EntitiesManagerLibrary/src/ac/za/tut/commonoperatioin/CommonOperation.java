/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ac.za.tut.commonoperatioin;

import java.util.ArrayList;

/**
 *
 * @author Wanele Mashego
 */
public interface CommonOperation <T>{
    
    public boolean add(T t);
    public T get(T t);
    public ArrayList<T> getAll();
    public boolean delete(T t);
    public boolean update(T t);        
    
    
}
