import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exitbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exitbutton extends Actor
{
    public Exitbutton()
    {
        GreenfootImage image = new GreenfootImage("EXIT", 40, Color.RED, null);
        setImage(image);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }  
}
