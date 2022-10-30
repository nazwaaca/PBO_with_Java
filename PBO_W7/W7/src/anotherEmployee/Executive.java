/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotherEmployee;

/**
 *
 * @author NAZWA FZ
 */
public class Executive extends Employee{
    private double bonus;
    
    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0;
    }
    
    public void awardBonus (double execBonus){
        bonus = execBonus;
    }
    
    public double pay(){
        double payment = super.pay() + bonus;
        
        bonus = 0;
        return payment;
    }
}
