import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevel extends World
{

    /**
     * Constructor for objects of class ThirdLevel.
     * 
     */
    public ThirdLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Robot robot = new Robot();        
        addObject(robot, 300, 200);
    }
}
