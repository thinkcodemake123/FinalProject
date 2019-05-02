import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    public Menu()
    {    
        super(852, 480, 1);  
        prepare();
        
    }
    
    private void prepare()
    {
        Title title = new Title();
        addObject(title, (int) (getWidth()*0.50), (int)(getHeight()*0.40));
        Playbutton play = new Playbutton();
        addObject(play,550, (int) (getHeight()*0.90));
        Instructionsbutton instructions = new Instructionsbutton();
        addObject(instructions, 650, (int) (getHeight()*0.90));
        Exitbutton exit = new Exitbutton();
        addObject(exit, 750, (int) (getHeight()*0.90));
    }
   
    
}
