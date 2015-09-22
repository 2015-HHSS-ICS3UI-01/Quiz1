
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
 * @author snowc4636
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the robot to live in
        City kw = new City();
        
        //Make new walls
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        
        //Make a thing
        new Thing (kw, 4, 1);
        new Thing (kw, 3, 2);
        new Thing (kw, 2, 3);
        new Thing (kw, 1, 4);
        
        
        
        //Make a robot to live in the city
        Robot Carter = new Robot(kw, 4, 0, Direction.EAST);
        Carter.move();
        Carter.pickThing();
        Carter.turnLeft();
        Carter.move();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.move();
        Carter.pickThing();
        Carter.turnLeft();
        Carter.move();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.move();
        Carter.pickThing();
        Carter.turnLeft();
        Carter.move();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.move();
        Carter.pickThing();
        Carter.move();
        Carter.putThing();
        Carter.move();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.move();
        Carter.putThing();
        Carter.turnLeft();
        Carter.move();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.move();
        Carter.putThing();
        Carter.turnLeft();
        Carter.move();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.turnLeft();
        Carter.move();
        Carter.putThing();
        Carter.turnLeft();
        Carter.move();
        
        
        
    }
}
