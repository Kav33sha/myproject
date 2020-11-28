/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kaveesha
 */
public class Employee extends Person{
private String EmpId;

public Employee(){

}

public Employee(String EmpId, String firstName, String lastName){

Super(firstName, lastName);
this.EmpId = EmpId;
}

public String getEmpId(){
return EmpId;
}

public void setEmpId(String EmpId){
this.EmpId = EmpId;
}

}
