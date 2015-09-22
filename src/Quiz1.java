
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
 * @author mitrm7692
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City
        City kw=new City();
        // Make a Robot
        Robot karel=new Robot(kw,4,0,Direction.EAST);
        // Make a Thing
        new Thing(kw,4,1);
        new Thing(kw,3,2);
        new Thing(kw,2,3);
        new Thing(kw,1,4);
        // Make Walls
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
        // Make Robot move forward
        karel.move();
        // Make Robot pick Thing up
        karel.pickThing();
        // Make Robot turn left
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot turn right
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot pick Thing up
        karel.pickThing();
        // Make Robot turn left
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot turn right
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot pick Thing up
        karel.pickThing();
        // Make Robot turn left
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot turn right
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot pick Thing up
        karel.pickThing();
        // Make Robot move forward
        karel.move();
        // Make Robot put Thing down
        karel.putThing();
        // Make Robot move forward
        karel.move();
        // Make Robot turn right
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot put Thing down
        karel.putThing();
        // Make Robot turn left
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot turn right
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot put Thing down
        karel.putThing();
        // Make Robot turn left
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot turn right
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
        // Make Robot put Thing down
        karel.putThing();
        // Make Robot turn left
        karel.turnLeft();
        // Make Robot move forward
        karel.move();
    }
}
