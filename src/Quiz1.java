
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
 * @author eadil1765
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a new city called L
        City L = new City();
        // make the robot and call him liam
        Robot liam = new Robot(L, 4, 0, Direction.EAST);
        // Add the walls
        new Wall (L, 4, 2, Direction.WEST);
        new Wall (L, 4, 2, Direction.NORTH);
        new Wall (L, 3, 3, Direction.WEST);
        new Wall (L, 3, 3, Direction.NORTH);
        new Wall (L, 2, 4, Direction.WEST);
        new Wall (L, 2, 4, Direction.NORTH);
        new Wall (L, 2, 5, Direction.NORTH);
        new Wall (L, 2, 5, Direction.EAST);
        new Wall (L, 3, 6, Direction.NORTH);
        new Wall (L, 3, 6, Direction.EAST);
        new Wall (L, 4, 7, Direction.NORTH);
        new Wall (L, 4, 7, Direction.EAST);
        //add the items for liam to pick up
        new Thing (L, 4, 1);
        new Thing (L, 3, 2);
        new Thing (L, 2, 3);
        new Thing (L, 1, 4);
        //make the robot move and pick up the items
        liam.move();
        liam.pickThing();
        liam.turnLeft();
        liam.move();
        liam.turnLeft();
        liam.turnLeft();
        liam.turnLeft();
        liam.move();
        liam.pickThing();
        liam.turnLeft();
        liam.move();
        liam.turnLeft();
        liam.turnLeft();
        liam.turnLeft();
        liam.move();
        liam.pickThing();
        liam.turnLeft();
        liam.move();
        liam.turnLeft();
        liam.turnLeft();
        liam.turnLeft();
        liam.move();
        liam.pickThing();
        liam.move();
        liam.putThing();
        liam.move();
        liam.turnLeft();
        liam.turnLeft();
        liam.turnLeft();
        liam.move();
        liam.putThing();
        liam.turnLeft();
        liam.putThing();
        liam.move();
        liam.turnLeft();
        liam.turnLeft();
        liam.turnLeft();
        liam.move();
        liam.turnLeft();
        liam.putThing();
        liam.move();
        liam.turnLeft();
        liam.turnLeft();
        liam.turnLeft();
        liam.move();
        new Thing (L, 4, 8);
        liam.turnLeft();
        liam.move();
       
        
     
          
    }
}
