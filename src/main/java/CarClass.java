/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class CarClass 
{
    
    private int yearModel;
    private String make;
    private int speed; 

    public CarClass(int yearModel, String make) 
    {
        this.yearModel = yearModel;
        this.make = make;
    }

    public int getYearModel() 
    {   
    return yearModel;
    }

    public String getMake()
    {
    return make;
    }

    public int getSpeed() 
    {
    return speed;
    }
    
    public void setSpeed(int speed)
    {
    this.speed = speed;
    }

    public void accelerate() 
    {
     speed += 5;
    }

    public void brake () 
    {
     speed -= 5;
    }

}
