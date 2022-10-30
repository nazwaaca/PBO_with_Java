/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTask2;

/**
 *
 * @author NAZWA FZ
 */
public class Square extends Rectangle{
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side,side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side,side, color, filled);
    }
    
    public double getSide(){
        return super.getLength();
    }
    
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth(double side){
      super.setLength(side);
    }
    @Override
    public void setLength(double side){
      super.setWidth(side);
    }
     
    public String toString(){
        return "A Rectangle with side = " + getSide()
                +" area = " +super.getArea()+" and Perimeter = " + super.getPerimeter()
                +" which is a subclass of " + super.toString();
    }
    
}

