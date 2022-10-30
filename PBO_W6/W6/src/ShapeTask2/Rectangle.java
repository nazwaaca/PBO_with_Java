/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTask2;

/**
 *
 * @author NAZWA FZ
 */
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(double length, double width, String color, boolean filled){
        this.length = length;
        this.width = width;
        super.setColor(color);
        super.setFilled(filled);
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return this.length*this.width;
    }
    
    public double getPerimeter(){
        return (2*this.length) + (2*this.width);
    }
    
    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " , length = " + getLength()
                + " area = " +getArea()+" and Perimeter = " + getPerimeter()
                +" which is a subclass of " + super.toString();
    }    
    
    
    
}
