/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package java_class_17_lab;

/**
 *
 * @author instlogin
 */
public class Dog {
    private String name;
    private int rabiesId;

    public Dog() {
    }

    public Dog(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }
    
    public String toString(){
        String returnString = getName() + " " + getRabiesId();
        return returnString;
    }
        
        

    

}
