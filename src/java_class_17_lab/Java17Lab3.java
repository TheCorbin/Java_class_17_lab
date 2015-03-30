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
public class Java17Lab3 {
    
    public static void main(String[] args) {
    
    List employeesAndDogs = new ArrayList();
    
    employeesAndDogs.add(new Employee("Bob","Smith", "333-33-3333"));
    employeesAndDogs.add(new Dog("puffy", 333333));
    employeesAndDogs.add(new Dog("Sir PerryWinkle", 333));
    employeesAndDogs.add(new Employee("Steve","Smith", "333-33-2323"));
    employeesAndDogs.add(new Employee("Jared","Smith", "333-33-3333"));
    
    
    for (Object employeeOrDog: employeesAndDogs){
        System.out.println(employeeOrDog.toString());
    }
    }
    
    
    
}
