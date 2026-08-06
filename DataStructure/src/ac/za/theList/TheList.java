/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac.za.theList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wanele Mashego
 */
public class TheList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Integer> theList = new ArrayList<>();
        
        if(theList.isEmpty())
        {
            
            System.out.println("The List is empty ");
            
            theList.add(1);
            theList.add(2);
            theList.add(3);
            theList.add(4);
            theList.add(5);
            
           theList.forEach(System.out::println);
            
           
        }
        
        theList.remove(0);
        
        theList.forEach(System.out::println);
        
        
    }
    
}
