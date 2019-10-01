/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baileyanderson
 */
public class Circle {
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double inputRadius)
    {
        this.radius = inputRadius;
    }
    
    public Circle() 
    {
        radius = 0.0;
    }
    
    public void setRadius(double inputRadius) 
    {
        this.radius = inputRadius;
    }
    
    public double getRadius() 
    {
        return radius;
    }
    
    public double getArea() 
    {
        return PI * radius * radius;
    }
    
    public double getDiameter() 
    {
        return radius * 2;
    }
    
    public double getCircumference() 
    {
        return 2 * PI * radius;
    }
    
}
