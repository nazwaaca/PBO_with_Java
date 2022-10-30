/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTask2;

import CylinderCircle.*;

/**
 *
 * @author NAZWA FZ
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle() {
        radius = 1.0;
    }
    public Circle(double r) {
        radius = r;
    }
    
    //Hasil Modifikasi penambahan constructor
    public Circle(double r, String color, boolean filled) {
        this.radius = r;
        super.setColor(color);
        super.setFilled(filled);
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    public double getArea() {
        return radius*radius*Math.PI;
    } 
    

    @Override
    public String toString() {
        return "A Circle with radius=" + this.radius + " which is a subclass of " + super.toString();
    }
 
    
 }  
    
