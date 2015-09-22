
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
 * @author vickj2854
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// make a city
        City kw = new City();         
// make a robot named karal
        Robot karal = new Robot(kw, 4,0, Direction.EAST);
// make vertical walls
        new Wall(kw, 4,2, Direction.WEST);
        new Wall(kw, 3,3, Direction.WEST);
        new Wall(kw, 2,4, Direction.WEST);
        new Wall(kw, 2,5, Direction.EAST);
        new Wall(kw, 3,6, Direction.EAST);
        new Wall(kw, 4,7, Direction.EAST);
 // make horizontal walls
        new Wall(kw, 4,2, Direction.NORTH);
        new Wall(kw, 3,3, Direction.NORTH);
        new Wall(kw, 2,4, Direction.NORTH);
        new Wall(kw, 2,5, Direction.NORTH);
        new Wall(kw, 3,6, Direction.NORTH);
        new Wall(kw, 4,7, Direction.NORTH);
 // make things
        new Thing(kw, 4,1);
        new Thing(kw, 3,2);
        new Thing(kw, 2,3);
        new Thing(kw, 1,4);
 // move karal and pick and put things 
        karal.move();
        karal.pickThing();
        karal.turnLeft();
        karal.move();
        karal.turnLeft();
        karal.turnLeft();
        karal.turnLeft();
        karal.move();
        karal.pickThing();
        karal.turnLeft();
        karal.move();
        karal.turnLeft();
        karal.turnLeft();
        karal.turnLeft();
        karal.move();
        karal.pickThing();
        karal.turnLeft();
        karal.move();
        karal.turnLeft();
        karal.turnLeft();
        karal.turnLeft();
        karal.move();
        karal.pickThing();
        karal.move();
        karal.putThing();
        karal.move();
        karal.turnLeft();
        karal.turnLeft();
        karal.turnLeft();
        karal.move();
        karal.putThing();
        karal.turnLeft();
        karal.move();
        karal.turnLeft();
        karal.turnLeft();
        karal.turnLeft();
        karal.move();
        karal.putThing();
        karal.turnLeft();
        karal.move();
        karal.turnLeft();
        karal.turnLeft();
        karal.turnLeft();
        karal.move();
        karal.putThing();
        karal.turnLeft();
        karal.move();
// karal is done
        
        
        
        
        
        
        
        
        

        
        
                
         
                
                
    }
}
