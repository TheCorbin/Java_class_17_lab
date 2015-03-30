/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_17_lab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ryancorbin
 */
public class Java17Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List hobbyList = new ArrayList();
        hobbyList.add("Bike Theft");
        hobbyList.add("Fireworks");
        hobbyList.add("Inflatable Pool Toys");
        
        for(int i=0; i < hobbyList.size(); i++) {
            String s = (String)hobbyList.get(i);
            System.out.println(s);
        }
        
        hobbyList.add("Ultra Marathoning");
        hobbyList.add("Tree Climbing");
        
        System.out.println("");
        
        for(int i=0; i < hobbyList.size(); i++) {
            String s = (String)hobbyList.get(i);
            System.out.println(s);
        }
    
        hobbyList.remove(0);
    
        System.out.println("");
        
        for(int i=0; i < hobbyList.size(); i++) {
            String s = (String)hobbyList.get(i);
            System.out.println(s);
        }
        
        
        
        
    
    }
    
    
    
    
}
