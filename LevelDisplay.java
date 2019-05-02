import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelDisplay extends Actor
{
    public int WIDTH = 100;
    public int HEIGHT = 100;
    public static final float FONT_SIZE = 14.0f;
    public LevelDisplay(int level)
    {
        GreenfootImage image = new GreenfootImage("Level " + level, 25,Color.BLACK,Color.GREEN); 
        setImage(image);
    }
}
