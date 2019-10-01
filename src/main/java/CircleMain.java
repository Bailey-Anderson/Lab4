
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class CircleMain {
    public static void main(String[] args) 
    {
        
    Scanner keyboard = new Scanner(System.in);
    
    Circle myCircle = new Circle();
    
    System.out.println("Please enter the circle's radius: ");
    double userRadius = keyboard.nextDouble();
    
    myCircle.setRadius(userRadius);
    
    System.out.println("Area: " + myCircle.getArea());
    System.out.println("Diameter: " + myCircle.getDiameter());
    System.out.println("Circumference: " + myCircle.getCircumference());
    
    }
}
