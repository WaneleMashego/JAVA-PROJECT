/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac.za.theMap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Wanele Mashego
 */
public class TheMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String,Integer> map = new HashMap<>();
        
        if(map.isEmpty())
        {
            System.out.println("Map is empty");
            
            map.put("Mash", 1);
            map.put("Nxumalo", 2);
            map.put("Simeon", 3);
            map.put("Zwide", 4);
            map.put("Mkhatshwa", 5);
            
            for(Map.Entry data :map.entrySet())
            {
                System.out.println(data.getKey() + "   " +  data.getValue());
            }
        }
    }
    
}
