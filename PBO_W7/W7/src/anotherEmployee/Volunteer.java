/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotherEmployee;

/**
 *
 * @author NAZWA FZ
 */
public class Volunteer extends StaffMember {
    public Volunteer (String eName, String eAddress, String ePhone){
        super(eName,eAddress, ePhone);
    }
    
    public double pay(){
        return 0.0;
    }
}
