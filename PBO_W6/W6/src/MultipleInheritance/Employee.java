/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author NAZWA FZ
 */
//Extend dari abstract class sortable
//public class Employee extends Sortable{
//Implement dari interface Sortable
public class Employee implements Sortable{
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
    
    public Employee(String n, double s, int day, int month, int year){
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }
    
    public void print(){
        System.out.println(getName() + " " + getSalary() + " " + getHireyear());
    }
    
    public void raiseSalary(double byPercent){
        salary *= 1 + byPercent / 100;
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHireday() {
        return hireday;
    }

    public void setHireday(int hireday) {
        this.hireday = hireday;
    }

    public int getHiremonth() {
        return hiremonth;
    }

    public void setHiremonth(int hiremonth) {
        this.hiremonth = hiremonth;
    }

    public int getHireyear() {
        return hireyear;
    }

    public void setHireyear(int hireyear) {
        this.hireyear = hireyear;
    }
    
    
    //Override dari abstract class sortable
    @Override
    public int compareTo(Sortable b){
        Employee eb = (Employee) b;
        if (salary<eb.salary)
            return -1;
        if (salary>eb.salary)
            return +1;
    return 0;
    
    
    }  
    
}

