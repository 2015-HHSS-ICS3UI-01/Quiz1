
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
 * @author sevcm7279
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        //make stairs
        new Wall (eep, 4, 2, Direction.WEST);
        new Wall (eep, 4, 2, Direction.NORTH);
        new Wall (eep, 3, 3, Direction.WEST);
        new Wall (eep, 3, 3, Direction.NORTH);
        new Wall (eep, 2, 4, Direction.WEST);
        new Wall (eep, 2, 4, Direction.NORTH);
        new Wall (eep, 2, 5, Direction.NORTH);
        new Wall (eep, 2, 5, Direction.EAST);
        new Wall (eep, 3, 6, Direction.NORTH);
        new Wall (eep, 3, 6, Direction.EAST);
        new Wall (eep, 4, 7, Direction.NORTH);
        new Wall (eep, 4, 7, Direction.EAST);
        
        //make things
        new Thing (eep, 4, 1);
        new Thing (eep, 3, 2);
        new Thing (eep, 2, 3);
        new Thing (eep, 1, 4);
        
        //make robot
        Robot jimbo = new Robot(eep, 4, 0, Direction.EAST);
        
        // jimbo climb
        jimbo.move();
        jimbo.pickThing();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.pickThing();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
         jimbo.move();
        jimbo.pickThing();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();        
         jimbo.move();
        jimbo.pickThing();
        
        //jimbo decsending
        jimbo.move();
        jimbo.putThing();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.putThing();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.putThing();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.putThing();
        jimbo.turnLeft();
        jimbo.move();

    }
}
