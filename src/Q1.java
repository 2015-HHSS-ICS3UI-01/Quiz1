
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
 * @author dawsr2694
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make City
        City Q1 = new City();
        
        //Make Robot
        Robot karel = new Robot(Q1, 4, 0, Direction.EAST);
        
        //Make Walls
        new Wall(Q1, 4, 2, Direction.WEST);
        new Wall(Q1, 4, 2, Direction.NORTH);
        
        new Wall(Q1, 3, 3, Direction.WEST);
        new Wall(Q1, 3, 3, Direction.NORTH);
        
        new Wall(Q1, 2, 4, Direction.WEST);
        new Wall(Q1, 2, 4, Direction.NORTH);
        
        new Wall(Q1, 2, 5, Direction.NORTH);
        new Wall(Q1, 2, 5, Direction.EAST);
        
        new Wall(Q1, 3, 6, Direction.NORTH);
        new Wall(Q1, 3, 6, Direction.EAST);
        
        new Wall(Q1, 4, 7, Direction.NORTH);
        new Wall(Q1, 4, 7, Direction.EAST);
        
        //Make Things
        new Thing(Q1, 4, 1);
        new Thing(Q1, 3, 2);
        new Thing(Q1, 2, 3);
        new Thing(Q1, 1, 4);
        
        //MAKE ROBOT MOVE
        
        //Move karel up left side of stairs and get things
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft(); //Right turn
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft(); //Right turn
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft(); //Right turn
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.pickThing();
        
        //Move karel down the right side of stairs and put things
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft(); //Right turn
        karel.turnLeft(); 
        karel.turnLeft(); 
        
        karel.move();
        karel.putThing();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft(); //Right turn
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        
        karel.move();
        karel.turnLeft(); //Right turn
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        
        karel.move();
        }
}
