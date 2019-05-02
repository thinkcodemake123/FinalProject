import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    public int catlife = 1; 
    
    public Bullet()
    {
        setRotation(90);
    }
    public void destroy()
    {
        World world = getWorld();
        world.addObject(new Explosion(), getX(), getY());
        world.removeObject(this);
    }
    public void act()
    {
        setLocation(getX(), getY()+2);
        if(isTouching(Cat.class))
        {
            removeTouching(Cat.class);
            World world = getWorld();
            world.addObject(new Explosion(), getX(), getY()); 
            Greenfoot.playSound("explosion.wav");
            ((Scenario)getWorld()).GAMEOVER();
        }
        if(getY() == 460)
        {
            getWorld().removeObject(this);
        }
    }
}

