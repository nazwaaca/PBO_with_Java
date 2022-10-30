/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotherEmployee;

/**
 *
 * @author NAZWA FZ
 */
abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    
    public StaffMember (String eName, String eAddress, String ePhone){
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    

    @Override
    public String toString(){
       String result = "Name : " + name + "\n";
       
       result += "Address : " + address + "\n";
       result += "Phone : " + phone;
       
       return result;
    }
    
    public abstract double pay();
}
