package java_class_17_lab;

import java.util.*;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String toString(){
        String returnString = getFirstName() + " " + getLastName(); 
        return returnString;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
    public boolean equals(Object target){
        if(target== null) {
            return false;
        }
       Employee e2 = (Employee)target;
       if (this.getSsn().equals(e2.getSsn())) {
           return true;
       } else {
           return false;
       }
    }

 }
    

