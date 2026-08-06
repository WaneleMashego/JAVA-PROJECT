/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac.za.theQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Wanele Mashego
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Queue<Integer> numbersQueue = new LinkedList<>();
        
        
        
        if(numbersQueue.isEmpty())
        {
            System.out.println("Queue is empty ");
            
            numbersQueue.add(1);
            numbersQueue.add(2);
            numbersQueue.add(3);
            numbersQueue.add(4);
            numbersQueue.add(5);
           
            
            
        }
        
        for(Integer num:numbersQueue)
        {
            
        }
        
        
       
    }
    
}
