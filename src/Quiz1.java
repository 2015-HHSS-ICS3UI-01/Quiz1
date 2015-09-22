
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
 * @author richj0985
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a city for karel to live inside and move around
        City kw = new City();
        
        // make a robot to live within the city starting at the bottom of the 
        // stairs facing east
        Robot karel = new Robot (kw, 4, 0, Direction.EAST);
        
        // make walls to form a set of stairs for the robot to climb
        new Wall (kw, 4, 2, Direction.WEST);
        new Wall (kw, 4, 2, Direction.NORTH);
        new Wall (kw, 3, 3, Direction.WEST);
        new Wall (kw, 3, 3, Direction.NORTH);
        new Wall (kw, 2, 4, Direction.WEST);
        new Wall (kw, 2, 4, Direction.NORTH);
        new Wall (kw, 2, 5, Direction.NORTH);
        new Wall (kw, 2, 5, Direction.EAST);
        new Wall (kw, 3, 6, Direction.NORTH);
        new Wall (kw, 3, 6, Direction.EAST);
        new Wall (kw, 4, 7, Direction.NORTH);
        new Wall (kw, 4, 7, Direction.EAST);
        
        // make things for the robot to pick up and drop along the stairs
        new Thing (kw, 4, 1);
        new Thing (kw, 3, 2);
        new Thing (kw, 2, 3);
        new Thing (kw, 1, 4);
        
        // make karel climb up mounting picking up things and on the way down
        // putting down things
        
        // make karel move toward the stairs and move up the first step while picking up a thing
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        
        // make karel climb the second step while picking up a thing
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        
        // make karel climb the third thing / top step while picking up a thing
        // and putting it down one move later
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.putThing();
        
        // make karel move down a step and put a thing down
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        
        // make karel move down another step and put a thing down
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        
        // make karel move down to the bottom and put a thing down
        // karel stops one move after the thing put down
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
