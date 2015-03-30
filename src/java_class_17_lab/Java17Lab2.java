/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_17_lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ryancorbin
 */
public class Java17Lab2 {
    
    public static void main(String[] args) {
    
    List<Employee> employees = new ArrayList<Employee>();
    
    employees.add(new Employee("Bob","Smith", "333-33-3333"));
    employees.add(new Employee("Steve","Smith", "333-33-2323"));
    employees.add(new Employee("Jared","Smith", "333-33-3333"));
    
    
    for (Employee employee: employees){
        System.out.println(employee.toString());
    }
    
    
    }
}
