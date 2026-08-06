/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac.za.theSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Wanele Mashego
 */
public class TheSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<Integer> numbers = new HashSet<>();
        
        if(numbers.isEmpty())
        {
            System.out.println("List is Empty ");
            
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            
            for(Integer num:numbers)
            {
                System.err.println(num);
            }
           
            
            
            
        }
        
        
    }
    
}
