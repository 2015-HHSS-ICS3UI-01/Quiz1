
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
 * @author prevw5940
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karle = new Robot (kw, 4, 0, Direction.EAST);
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        karle.move();
        karle.pickThing();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.pickThing();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.pickThing();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.pickThing();
        karle.move();
        karle.putThing();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.putThing();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.putThing();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.putThing();
        karle.turnLeft();
        karle.move();
        // TODO code application logic here
    }
}
