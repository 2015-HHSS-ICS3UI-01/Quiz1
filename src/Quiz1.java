
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
 * @author pircn0556
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make city for robot
        City kw = new City();
        
        //Make stairs for robot
        new Wall(kw,4,2,Direction.WEST);
        new Wall(kw,4,2,Direction.NORTH);
        new Wall(kw,3,3,Direction.WEST);
        new Wall(kw,3,3,Direction.NORTH);
        new Wall(kw,2,4,Direction.WEST);
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,2,5,Direction.NORTH);
        new Wall(kw,2,5,Direction.EAST);
        new Wall(kw,3,6,Direction.NORTH);
        new Wall(kw,3,6,Direction.EAST);
        new Wall(kw,4,7,Direction.NORTH);
        new Wall(kw,4,7,Direction.EAST);
        
        //Put things on stairs
        new Thing(kw,4,1,Direction.EAST);
        new Thing(kw,3,2,Direction.EAST);
        new Thing(kw,2,3,Direction.EAST);
        new Thing(kw,1,4,Direction.EAST);
        
        //Make robot for city
        Robot karel = new Robot(kw,4,0,Direction.EAST);
        
        //Make karel pick up things and put them down on stairs
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
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
    }
}
