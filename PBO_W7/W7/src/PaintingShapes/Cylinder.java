/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;

/**
 *
 * @author NAZWA FZ
 */
public class Cylinder extends Shape {
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height)
    {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double area()
    {
        return Math.PI*radius*radius*height;
    }
    
    @Override
     public String toString()
    {
        String result = super.toString() + " of radius : "+ radius+" of height: "+height;
        return result;
    }
}
