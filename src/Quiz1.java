
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
 * @author agott2059
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City thomas = new City();
        
        Robot tom = new Robot (thomas, 4,0, Direction.EAST);
        
        new Wall(thomas, 4,2, Direction.WEST);
        new Wall(thomas, 4,2, Direction.NORTH);
        new Wall(thomas, 3,3, Direction.WEST);
        new Wall(thomas, 3,3, Direction.NORTH);
        new Wall(thomas, 2,4, Direction.WEST);
        new Wall(thomas, 2,4, Direction.NORTH);
        new Wall(thomas, 2,5, Direction.NORTH);
        new Wall(thomas, 2,5, Direction.EAST);
        new Wall(thomas, 3,6, Direction.NORTH);
        new Wall(thomas, 3,6, Direction.EAST);
        new Wall(thomas, 4,7, Direction.NORTH);
        new Wall(thomas, 4,7, Direction.EAST);
        
        new Thing(thomas, 4,1);
        new Thing(thomas, 3,2);
        new Thing(thomas, 2,3);
        new Thing(thomas, 1,4);
        
        tom.move();
        tom.pickThing();
        tom.turnLeft();
        tom.move();
        tom.turnLeft();
        tom.turnLeft();
        tom.turnLeft();
        tom.move();
        tom.pickThing();
        tom.turnLeft();
        tom.move();
        tom.turnLeft();
        tom.turnLeft();
        tom.turnLeft();
        tom.move();
        tom.pickThing();
        tom.turnLeft();
        tom.move();
        tom.turnLeft();
        tom.turnLeft();
        tom.turnLeft();
        tom.move();
        tom.pickThing();
        tom.move();
        tom.putThing();
        tom.move();
        tom.turnLeft();
        tom.turnLeft();
        tom.turnLeft();
        tom.move();
        tom.putThing();
        tom.turnLeft();
        tom.move();
        tom.turnLeft();
        tom.turnLeft();
        tom.turnLeft();
        tom.move();
        tom.putThing();
        tom.turnLeft();
        tom.move();
        tom.turnLeft();
        tom.turnLeft();
        tom.turnLeft();
        tom.move();
        tom.putThing();
        tom.turnLeft();
        tom.move();
    }
}
