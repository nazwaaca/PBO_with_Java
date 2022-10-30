/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CylinderCircle;

/**
 *
 * @author NAZWA FZ
 */
public class Circle {
    private double radius;
    private String color;
    
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    
    //Hasil Modifikasi penambahan constructor
    public Circle(double r, String color) {
        radius = r;
        setColor(color);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return radius*radius*Math.PI;
    } 
    
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
    
    //Hasil Modifikasi ditambah getter setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }  
    
}
