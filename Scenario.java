import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Calendar;
import java.util.List;
/**
 * Write a description of class Scenario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scenario extends World
{
    private ScoreKeeper scoreKeeper = new ScoreKeeper();
    private int actIteration = 0;
    private int x = 0;
    private int speed = 2;
    private int numRocketsCreated = 0;
    private int level = 0;
    private int maxRocketsPerLevel = 10;
    public static int scoreOfRockets = 5;
    
    public static int scoreOfRockets()
    {
        return scoreOfRockets();
    }
    /**
     * Constructor for objects of class Scenario.
     * 
     */
    public Scenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(852, 480, 1); 
        createCity();
        addGun();
        addScoreKeeper();
    }
    
    public void createCity()
    {
        int x = 0;
        int y = (int)(getHeight()*0.78);
        int counter = 1;
        while(true)
        {
            Actor cityActor = getCityActor();
            GreenfootImage image = cityActor.getImage();
            int width = image.getWidth();
            if((x + width) > getWidth())
            {
                break;
            }
            
            addObject(cityActor, x+width/2, y);
            x = x+width;
            counter = counter + 1;
            
            if(counter % 2 == 0)
            {
             House house = new House();
             GreenfootImage houseImage = house.getImage();
             int houseWidth = houseImage.getWidth();
            if((x + houseWidth) > getWidth())
            break;
            addObject(house, x + houseWidth/2,y);
            x = x + houseWidth;
            }
            else 
            {
            Building building = new Building();
            GreenfootImage buildingImage = building.getImage();
            int buildingWidth = buildingImage.getWidth();
            if((x+ buildingWidth) > getWidth())
            break;
            
            addObject(building, x+buildingWidth/2, y);
            x = x + buildingWidth;
            }
            counter = counter + 1;
        }  
        House house = new House();
        GreenfootImage houseImage = house.getImage();
        int houseImageWidth = houseImage.getWidth();
        addObject(house,x + houseImageWidth/2,y);
        House house2 = new House();
        addObject(house2, x+houseImageWidth/2,y);
        addObject(new Cat(),500,400);
        addObject(new Plane(), 0, 100);
    }
    
    public void addGun()
    {
        addObject(new Gun(scoreKeeper), getWidth() / 2, getHeight()/2);
    }
    
    public Actor getCityActor()
    {
        int buildingType = Greenfoot.getRandomNumber(3);
        if(buildingType == 0)
        {
            return new House();
        }
        else if(buildingType == 1)
        {
            return new Building();
        }
        else if(buildingType == 2)
        {
            return new Building2();
        }
        return null;
    }
    
    public void addLevelDisplay(int level)
    {
        addObject(new LevelDisplay(level), 600, (int) (getHeight()*0.95));
    }
    
    public void act()
    {
        java.util.List rocketList = getObjects(Rocket.class);
        if(numRocketsCreated >= (maxRocketsPerLevel * level) && rocketList.size() == 0)
        {
            level = level + 1;
            numRocketsCreated = 0;
            actIteration = 0;
            speed = 1;
            addLevelDisplay(level);
            return;
        }
        java.util.List houseList = getObjects(House.class);
        int numHomesLeft = 0;
        if(houseList != null)
        {
            numHomesLeft = houseList.size();
        }
        java.util.List buildingList = getObjects(Building.class);
        if(buildingList != null)
        {
            numHomesLeft = numHomesLeft + buildingList.size();
        }
        if(numHomesLeft == 0)
        {
            GAMEOVER();
            return;
        }
        actIteration = actIteration + 1;
        if(actIteration % 100 == 0)
        {
            Rocket rocket = new Rocket(speed);
            numRocketsCreated = numRocketsCreated + 2;
            if(numRocketsCreated > 0 && numRocketsCreated % 2.5 == 0)
            {
                speed = speed + 3;
                scoreOfRockets = scoreOfRockets + 5;
                return;
            }
            int rocketWidth = rocket.getImage().getWidth();
            x = Greenfoot.getRandomNumber(getWidth());
            if(x - rocketWidth < 0)
            {
                x = rocketWidth / 2;
            }
            else if(x + rocketWidth > getWidth())
            {
                x = getWidth() - rocketWidth/2;
            }
            addObject(rocket, x, 0);
            return;
        }
        return;
    }
    
    public void addScoreKeeper()
    {
       addObject(scoreKeeper, getWidth()/2, (int) (getHeight()*0.95)); 
    }
    
    public void GAMEOVER()
    {
        scoreKeeper.gameOver();
        PlayAgainbutton playagain = new PlayAgainbutton();
        addObject (playagain,450,300);
        Exitbutton exit = new Exitbutton();
        addObject(exit,800, (int) getWidth()/2);
        addObject(new EndDisplay(), getWidth()/2, getHeight()/2);
    }
    
}
