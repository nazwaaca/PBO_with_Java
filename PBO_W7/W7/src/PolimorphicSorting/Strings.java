/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorphicSorting;

import java.util.Scanner;

/**
 *
 * @author NAZWA FZ
 */
public class Strings 
{
    // --------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main (String[] args)
    {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];
        System.out.println ("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            stringList[i] = scan.next();
        // Sorting.selectionSort(stringList);
        Sorting.insertionSort(stringList);
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(stringList[i] + " ");
        System.out.println ();
        scan.close();
    }
}

