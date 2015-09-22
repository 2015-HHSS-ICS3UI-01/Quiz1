
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot matt = new Robot(kw, 4, 0, Direction.EAST);
        //add walls
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);

        //add things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        //move robot up wall & pick up things (right side)
        while (true) {
            matt.move();
            matt.pickThing();
            matt.turnLeft();
            matt.move();
            matt.turnLeft();
            matt.turnLeft();
            matt.turnLeft();
           
            if (matt.getStreet() == 1){
                break;
            }

        }matt.move();
        matt.pickThing();
        matt.move();
        matt.putThing();
        
        //left side statement
        while(true){
        matt.move();
        matt.turnLeft();
        matt.turnLeft();
        matt.turnLeft();
        matt.move();
        matt.putThing();
        matt.turnLeft();
        if (matt.getStreet() == 4){
            break;
        }
    }matt.move();
    }
}
