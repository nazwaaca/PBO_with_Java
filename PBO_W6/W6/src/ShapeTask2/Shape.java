/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTask2;

/**
 *
 * @author NAZWA FZ
 */
public class Shape {
    private String color;
    private boolean filled = true;
    
    public Shape (){
        color = "green";
        filled = true;
    }
    
    public Shape (String color, boolean filled){
        color = color;
        filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString(){
        String shapeFill = this.filled? "Filled" : "Not Filled";
        return "A shape with color of "+ getColor()+" and " + shapeFill;
    }
    
    
    
    
}
