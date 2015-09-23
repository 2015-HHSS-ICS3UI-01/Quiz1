
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
 * @author butlj9437
 */
public class Quiz_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make the things
            //City
        City town = new City();
            //Robot
        Robot jarvis = new Robot(town,4,0,Direction.EAST);
            //Walls and Things
        int inc = 0;
        int wallX = 2,wallY=4;
        while(inc!=3)
        {
            //Walls on the left
            new Wall(town,wallX,wallY,Direction.NORTH);
            new Wall(town,wallX,wallY,Direction.WEST);
            //Things
            new Thing(town,wallX-1,wallY);
            inc++;
            wallX++;
            wallY--;
        }
        new Thing(town,4,1);
        wallX=2;
        wallY=5;
        inc=0;
        while(inc!=3)
        {
            //Walls on the right
            new Wall(town,wallX,wallY,Direction.NORTH);
            new Wall(town,wallX,wallY,Direction.EAST);
            wallX++;
            wallY++;
            inc++;
        }
        //move the robot
        jarvis.move();
        jarvis.pickThing();
        //going up
        while(!jarvis.frontIsClear())
        {
            jarvis.turnLeft();
            jarvis.move();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.move();
            jarvis.pickThing();
        }
        jarvis.move();
        jarvis.putThing();
        //going down
        while(jarvis.getAvenue()!=8)
        {
            jarvis.move();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.turnLeft();
            jarvis.move();
            jarvis.turnLeft();
            jarvis.putThing();
        }
        jarvis.move();
    }
}
