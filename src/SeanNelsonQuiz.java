
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
 * @author nelss9013
 */
public class SeanNelsonQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make City
        City Quiz = new City();

        //Make Robot
        Robot karel = new Robot(Quiz, 4, 0, Direction.EAST);

        //Make Walls
        new Wall(Quiz, 4, 2, Direction.WEST);
        new Wall(Quiz, 3, 3, Direction.WEST);
        new Wall(Quiz, 2, 4, Direction.WEST);

        new Wall(Quiz, 4, 7, Direction.EAST);
        new Wall(Quiz, 3, 6, Direction.EAST);
        new Wall(Quiz, 2, 5, Direction.EAST);

        new Wall(Quiz, 4, 2, Direction.NORTH);
        new Wall(Quiz, 3, 3, Direction.NORTH);
        new Wall(Quiz, 2, 4, Direction.NORTH);
        new Wall(Quiz, 4, 7, Direction.NORTH);
        new Wall(Quiz, 3, 6, Direction.NORTH);
        new Wall(Quiz, 2, 5, Direction.NORTH);

        //Make Thing(s)
        new Thing(Quiz, 4, 1);
        new Thing(Quiz, 3, 2);
        new Thing(Quiz, 2, 3);
        new Thing(Quiz, 1, 4);

        //Move Robot
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
