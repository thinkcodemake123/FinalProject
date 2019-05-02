import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgainbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgainbutton extends Actor
{
    public PlayAgainbutton()
    {
        GreenfootImage image = new GreenfootImage("Play Again", 30, Color.BLACK, null);
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
