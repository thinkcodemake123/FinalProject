import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructionsbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructionsbutton extends Actor
{
    public Instructionsbutton()
    {
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Instructions());
        }
    }    
}
