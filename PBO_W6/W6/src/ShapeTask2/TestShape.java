/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShapeTask2;

/**
 *
 * @author NAZWA FZ
 */
public class TestShape {
    public static void main (String[] args){
        Circle c3 = new Circle(2.0, "green", false);
            System.out.println(c3.toString());
        Rectangle r3 = new Rectangle(2.0, 4.0, "blue", true);
            System.out.println(r3.toString());
        Square s3 = new Square(2.0, "blue", true);
            System.out.println(s3.toString());
    }
}
