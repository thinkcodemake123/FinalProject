import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gun extends Actor
{
    private ScoreKeeper gunScoreKeeper;
    public Gun(ScoreKeeper scorekeeper)
    {
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
        gunScoreKeeper = scorekeeper;
    }
    public void act() 
    {
        if(Greenfoot.mouseMoved(null))
        {
          MouseInfo mouse = Greenfoot.getMouseInfo();
          setLocation(mouse.getX(), mouse.getY());
        }
        if(Greenfoot.mouseClicked(null))
        {
            Rocket rocket = (Rocket) getOneObjectAtOffset(0,0,Rocket.class);
            if(rocket != null)
            {
                rocket.destroy();
                gunScoreKeeper.incrementScore(Scenario.scoreOfRockets);
                Greenfoot.playSound("explosion.wav");
            }
        }
    }    
}
