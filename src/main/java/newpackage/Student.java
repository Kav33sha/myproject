/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.mycompany.myproject.*;

/**
 *
 * @author kaveesha
 */
public class Student {
  
    
    private String firstName;
    private String lastName;
    
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
    this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName(){
    return this.firstName + " " + this.lastName;
    }
    
}
