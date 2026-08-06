/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac.za.theStack;

import java.util.Stack;

/**
 *
 * @author Wanele Mashego
 */
public class TheStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<Integer> numbers = new Stack<>();
        
        if(numbers.isEmpty())
        {
            System.out.println("The stack is Empty ");
            
            numbers.add(1);//at the bottom(first element)
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);//last element 
            
            numbers.forEach(System.out::println);
            System.err.println("The first element is " + numbers.firstElement() );
           
            System.out.println("The last elements is " + numbers.peek());
            //pop
            numbers.pop();
            
            numbers.push(6);
            
           
                
            numbers.forEach(System.out::println);
            
        }
         
        
    }
    
}
