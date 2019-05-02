import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3; 
    private GreenfootImage image4;
    private int frame = 1;
    public int catlife = 1;

    
    public Cat()
    {
       image1 = new GreenfootImage("cat-walk-right.png");
       image1.scale(97,77);
       image2 = new GreenfootImage("cat-walk-right-2.png");
       image2.scale(97,77);
       image3 = new GreenfootImage("cat-walk.png");
       image3.scale(97,77);
       image4 = new GreenfootImage("cat-walk-2.png");
       image4.scale(97,77);
       setImage(image1);
    }

    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKey();
    }    
    public void checkKey()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            moveRight();
            animateRight();
        }
        if(Greenfoot.isKeyDown("a"))
        {
            moveLeft();
            animateLeft();
        }
    }
    
    public void moveRight()
    {
        move(5);
    }
    
    public void moveLeft()
    {
        move(-5);
    }
    
    public void animateRight()
    {
        if(frame == 1)
        {
            setImage(image1);
        }
        else if (frame == 2)
        {
             setImage(image2);
             frame = 1;
             return;
        }
        frame++;
    }
    
    public void animateLeft()
    {
        if(frame == 1)
        {
            setImage(image3);
        }
        else if (frame == 2)
        {
            setImage(image4);
            frame = 1;
            return;
        }
        frame++;
    }
}
