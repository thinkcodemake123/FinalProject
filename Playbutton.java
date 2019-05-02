import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playbutton extends Actor
{
    public Playbutton()
    {
        GreenfootImage image = getImage();
        image.scale(50,45);
        setImage(image);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Scenario());
        }
    }    
}
