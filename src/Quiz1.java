
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Make a City for the Robot to live in
        City NYC = new City();
        
        Robot karel = new Robot(NYC, 4, 0, Direction.EAST); 
        //Make Walls 
        new Wall(NYC, 4, 2, Direction.WEST); 
        new Wall(NYC, 4, 2, Direction.NORTH); 
        new Wall(NYC, 3, 3, Direction.WEST); 
        new Wall(NYC, 3, 3, Direction.NORTH);
        new Wall(NYC, 2, 4, Direction.WEST); 
        new Wall(NYC, 2, 4, Direction.NORTH);
        new Wall(NYC, 2, 5, Direction.NORTH);
        new Wall(NYC, 2, 5, Direction.EAST);
        new Wall(NYC, 3, 6, Direction.NORTH);
        new Wall(NYC, 3, 6, Direction.EAST);
        new Wall(NYC, 4, 7, Direction.NORTH);
        new Wall(NYC, 4, 7, Direction.EAST);
        
        new Thing(NYC, 4, 1); 
        new Thing(NYC, 3, 2); 
        new Thing(NYC, 2, 3); 
        new Thing(NYC, 1, 4); 
        
        // Karel starts to pick up the things
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        
        //Karel starts to put down the things
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.putThing();
        karel.move();
        
        
        
    }
}
