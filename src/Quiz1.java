
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
 * @author moraj0721
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a City for the Robot to live in
        City Rad = new City();
        
        //Make a Robot to live in the City
        Robot brad = new Robot(Rad, 4, 0, Direction.EAST);
        
        //Make walls
        new Wall(Rad, 4, 2, Direction.WEST);
        new Wall(Rad, 4, 2, Direction.NORTH);
        new Wall(Rad, 3, 3, Direction.WEST);
        new Wall(Rad, 3, 3, Direction.NORTH);
        new Wall(Rad, 2, 4, Direction.WEST);
        new Wall(Rad, 2, 4, Direction.NORTH);
        new Wall(Rad, 2, 5, Direction.NORTH);
        new Wall(Rad, 2, 5, Direction.EAST);
        new Wall(Rad, 3, 6, Direction.NORTH);
        new Wall(Rad, 3, 6, Direction.EAST);
        new Wall(Rad, 4, 7, Direction.NORTH);
        new Wall(Rad, 4, 7, Direction.EAST);
        
        //Make a new Thing
        new Thing(Rad, 4, 1);
        new Thing(Rad, 3, 2);
        new Thing(Rad, 2, 3);
        new Thing(Rad, 1, 4);
        
        brad.move();
        brad.pickThing();
        brad.turnLeft();
        brad.move();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.move();
        brad.pickThing();
        brad.turnLeft();
        brad.move();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.move();
        brad.pickThing();
        brad.turnLeft();
        brad.move();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.move();
        brad.pickThing();
        brad.move();
        brad.putThing();
        brad.move();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.move();
        brad.putThing();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.move();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.move();
        brad.putThing();
        brad.turnLeft();
        brad.move();
        brad.turnLeft();
        brad.turnLeft();
        brad.turnLeft();
        brad.move();
        brad.putThing();
        brad.turnLeft();
        brad.move();
        
        
        
    }
}
