/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_17_lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ryancorbin
 */
public class Java17Lab4 {
    
    public static void main(String[] args) {
    
    Set<Employee> employees = new HashSet<Employee>();
    
    employees.add(new Employee("Bob","Smith", "333-33-3333"));
    employees.add(new Employee("Steve","Smith", "333-33-3333"));
    employees.add(new Employee("Jared","Smith", "333-13-3333"));
    
    
    for (Employee employee: employees){
        System.out.println(employee.toString());
    }
    
    
    }
}
