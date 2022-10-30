/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CylinderCircle;

/**
 *
 * @author NAZWA FZ
 */
public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double height) {
       super();
       this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius); 
           this.height = height;
    }
  
    public double getHeight() {
        return height;
    }
    
    //Hasil Modifikasi getArea menjadi super.getArea()
    public double getVolume() {
        return super.getArea()*height;
    }
    
    //Hasil Modifikasi dengan meng override 
    @Override
    public double getArea() {
        return 2*Math.PI*getHeight() + 2*super.getArea();
    }
    
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }


}
