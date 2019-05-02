
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        super(852, 480, 1); 
        addObject(new Backbutton(),100,430);
        addObject(new Instructiontext(), 400, 100);
        addObject(new Instructiontext2(),400, 150);
        addObject(new Instructiontext5(),400,200);
        addObject(new Instructiontext4(),400,350);
        addObject(new Instructiontext3(),400,400);
        addObject(new Rocket2(),750,100);
        addObject(new Gun2(), 700, 100);
        addObject(new Building(), 750, 200);
        addObject(new Cat(), 750,350);
        addObject(new Bullet2(), 800, 350);
        Greenfoot.playSound("backgroundmusic.wav");
    }
}
