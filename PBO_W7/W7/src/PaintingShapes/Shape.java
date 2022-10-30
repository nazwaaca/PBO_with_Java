/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;

/**
 *
 * @author NAZWA FZ
 */
abstract public class Shape 
{
    //instance variable called shapeName
    private String shapeName;
    
    //constructor that return shapeName
    public Shape (String shapeName)
    {
        this.shapeName = shapeName;
    }
    //abstract methode area
    public abstract double area();
    public  String toString()
    {
        String result = "Shape Name : "+this.shapeName;
        return result;
    }
}
