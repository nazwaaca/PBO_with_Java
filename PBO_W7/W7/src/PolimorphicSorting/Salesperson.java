/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorphicSorting;

/**
 *
 * @author NAZWA FZ
 */

public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;
    
    //------------------------------------------------------
    // Constructor: Sets up the sales person object with
    // the given data.
    //------------------------------------------------------
    public Salesperson (String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    //-------------------------------------------
    // Returns the sales person as a string.
    //-------------------------------------------
    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    //-------------------------------------------
    // Returns true if the sales people have
    // the same name.
    //-------------------------------------------
    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
        firstName.equals(((Salesperson)other).getFirstName()));
    }
    
    //--------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    //--------------------------------------------------
    public int compareTo(Object other)
    {
        int result;
        if(totalSales>((Salesperson)other).totalSales) result = 1;
        else if (totalSales<((Salesperson)other).totalSales) result = -1;
        else
        {
            result = firstName.compareTo(((Salesperson)other).firstName);
            if(result == 0) result = lastName.compareTo(((Salesperson)other).lastName);
        }        
        return result;
    }

    //-------------------------
    // First name accessor.
    //-------------------------
    public String getFirstName()
    { 
        return firstName;
    }

    //-------------------------
    // Last name accessor.
    //-------------------------
    public String getLastName()
    {
        return lastName;
    }
    
    //-------------------------
    // Total sales accessor.
    //-------------------------
    public int getSales()
    {
        return totalSales;
    }
} 
 