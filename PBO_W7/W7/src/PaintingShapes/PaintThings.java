/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;
import java.text.DecimalFormat;
/**
 *
 * @author NAZWA FZ
 */
public class PaintThings {
 public static void main (String[] args)
 {
    final double COVERAGE = 350;
    Paint paint = new Paint(COVERAGE);
    Rectangle deck = new Rectangle(25,35);
    Sphere bigBall = new Sphere(15);
    Cylinder tank = new Cylinder(10,30);
    
    double deckAmt, ballAmt, tankAmt;
    // Instantiate the three shapes to paint
    
    // Compute the amount of paint needed for each shape
    deckAmt = paint.amount(deck);
    ballAmt = paint.amount(bigBall);
    tankAmt = paint.amount(tank);
    

    // Print the amount of paint for each.
    DecimalFormat fmt = new DecimalFormat("0.#");
    System.out.println ("\nNumber of gallons of paint needed...");
    System.out.println ("Deck " + fmt.format(deckAmt));
    System.out.println ("Big Ball " + fmt.format(ballAmt));
    System.out.println ("Tank " + fmt.format(tankAmt));
 }
}
