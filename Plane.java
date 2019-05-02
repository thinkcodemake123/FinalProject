import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    private int shootingtiming = 0;
    private int direction = 0;
    private GreenfootImage imageplane;
    private GreenfootImage imageplane2;
    
    public Plane()
    {
        if(direction == 0)
        {
            imageplane = new GreenfootImage("airplane.png");
            imageplane.scale(83,83);
            setImage(imageplane);
        }
        
        if(direction == 1)
        {
            imageplane2 = new GreenfootImage("airplane.png");
            imageplane2.scale(83,83);
            imageplane2.rotate(180);
            setImage(imageplane2);
        }
        
        
    }
    
    public void act() 
    {
        if(direction == 0)
        {
            setLocation(getX()+1,getY());
            fire();
            imageplane = new GreenfootImage("airplane.png");
            imageplane.scale(83,83);
            setImage(imageplane);
        }
        if(getX() == 850)
        {
            direction = 1;
        }
        if(getX() == 1)
        {
            direction = 0;
        }
        if(direction == 1)
        {
            setLocation(getX()-1,getY());
            fire();
            imageplane2 = new GreenfootImage("airplane.png");
            imageplane2.scale(83,83);
            imageplane2.rotate(180);
            setImage(imageplane2);
        }
    }   
    
    private void fire()
    {
        if(shootingtiming == 100)
        {
            getWorld().addObject(new Bullet(),getX(), getY());
            shootingtiming = 0;
        }
        else
        {
            shootingtiming++;
        }
        
    }
}
