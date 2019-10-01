
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
public class CarClassMain 
{
    public static void main(String[] args) 
    {

    Scanner keyboard = new Scanner (System.in);
        
    int yearModel = 0;
    int speed = 0;
    String make = null;

    CarClass myCar = new CarClass(yearModel, make);

    System.out.println("What is the year of your car? ");
    yearModel = keyboard.nextInt();

    System.out.println("What is the make of your car? ");
    make = keyboard.next();

    System.out.println("How fast is your car going?  ");
    speed = keyboard.nextInt();
    
    myCar.setSpeed(speed);

    for(int i=0; i<5; i++)
    {
        myCar.accelerate();
    }
    
    for(int i=0; i>5; i++)
    {
        myCar.brake();
    }

    System.out.println("Car's speed: " + myCar.getSpeed());
    
    }
}
