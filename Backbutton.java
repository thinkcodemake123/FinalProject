import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Backbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backbutton extends Actor
{
    public Backbutton()
    {
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
        }
    }    
}
