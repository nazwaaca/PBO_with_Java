/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anotherEmployee;

/**
 *
 * @author NAZWA FZ
 */
public class Commission extends Hourly {
    
    //2 instance variable
    private double totalSales;
    private double commissionRate;
    
    public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        //the total sales should be set back to 0
        this.totalSales = 0.0;
        //2 for 20%
        this.commissionRate = commissionRate/10;
    }
    
    public void addSales(double totalSales) 
    {
        this.totalSales = totalSales;
    }
    
    @Override
    public double pay()
    {
       double payment = super.pay() + totalSales * commissionRate;
       totalSales = 0;
       return payment;
    }
    
    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal sales = " + totalSales;
        return result;
    }
    

}
