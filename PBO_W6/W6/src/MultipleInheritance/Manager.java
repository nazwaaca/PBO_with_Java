/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MultipleInheritance;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author NAZWA FZ
 */
//Extends dari Employee dan Implement dari interface Sortable
public class Manager extends Employee implements Sortable{
    private String secretaryName;
    public Manager (String n, double s, int d, int m, int y){
        super(n, s, d, m, y);
        secretaryName = "";
    }
    
    @Override
    public void raiseSalary(double byPercent){
    // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - getHireyear());
        //System.out.println(bonus/0.5);
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }
    
} 
   

