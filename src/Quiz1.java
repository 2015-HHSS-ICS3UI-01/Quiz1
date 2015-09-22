
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
 * @author duttr4019
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city.
        City gotham = new City();

        //Make stairs in the city.

        new Wall(gotham, 4, 2, Direction.WEST);
        new Wall(gotham, 3, 3, Direction.WEST);
        new Wall(gotham, 2, 4, Direction.WEST);
        new Wall(gotham, 2, 5, Direction.EAST);
        new Wall(gotham, 3, 6, Direction.EAST);
        new Wall(gotham, 4, 7, Direction.EAST);
        new Wall(gotham, 4, 2, Direction.NORTH);
        new Wall(gotham, 3, 3, Direction.NORTH);
        new Wall(gotham, 2, 4, Direction.NORTH);
        new Wall(gotham, 2, 5, Direction.NORTH);
        new Wall(gotham, 3, 6, Direction.NORTH);
        new Wall(gotham, 4, 7, Direction.NORTH);

        //Place things on the stairs.

        new Thing(gotham, 4, 1);
        new Thing(gotham, 3, 2);
        new Thing(gotham, 2, 3);
        new Thing(gotham, 1, 4);

        //Create a robot to live in this city.

        Robot batman = new Robot(gotham, 4, 0, Direction.EAST);

        //Have batman climb up the stairs, collecting things in his way.

        batman.move();
        batman.pickThing();
        batman.turnLeft();
        batman.move();
        batman.turnLeft();
        batman.turnLeft();
        batman.turnLeft();
        batman.move();
        batman.pickThing();
        batman.turnLeft();
        batman.move();
        batman.turnLeft();
        batman.turnLeft();
        batman.turnLeft();
        batman.move();
        batman.pickThing();
        batman.turnLeft();
        batman.move();
        batman.turnLeft();
        batman.turnLeft();
        batman.turnLeft();
        batman.move();
        batman.pickThing();

        //Have Batman climb down the stairs, placing things on his way.

        batman.move();
        batman.putThing();
        batman.move();
        batman.turnLeft();
        batman.turnLeft();
        batman.turnLeft();
        batman.move();
        batman.putThing();
        batman.turnLeft();
        batman.move();
        batman.turnLeft();
        batman.turnLeft();
        batman.turnLeft();
        batman.move();
        batman.putThing();
        batman.turnLeft();
        batman.move();
        batman.turnLeft();
        batman.turnLeft();
        batman.turnLeft();
        batman.move();
        batman.putThing();
        batman.turnLeft();
        batman.move();





    }
}
