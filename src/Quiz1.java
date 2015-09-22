
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
 * @author malcr1272
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a new city
        City kw = new City();
        
        //Make a Robot to live in the city
        Robot karel = new Robot(kw,4,0,Direction.EAST);
        
        //create the stairs
        new Wall (kw,4,2,Direction.WEST);
        new Wall (kw,4,2,Direction.NORTH);
        new Wall (kw,3,3,Direction.WEST);
        new Wall (kw,3,3,Direction.NORTH);
        new Wall (kw,2,5,Direction.NORTH);
        new Wall (kw,2,4,Direction.NORTH);
        new Wall (kw,3,3,Direction.NORTH);
        new Wall (kw,2,4,Direction.WEST);
        new Wall (kw,2,5,Direction.EAST);
        new Wall (kw,3,6,Direction.NORTH);
        new Wall (kw,3,6,Direction.EAST);
        new Wall (kw,4,7,Direction.NORTH);
        new Wall (kw,4,7,Direction.EAST);
        
        //Create things on stairs
        new Thing (kw,4,1);
        new Thing (kw,3,2);
        new Thing (kw,2,3);
        new Thing (kw,1,4);
        
        //make Karel climb up the stairs and pick up things
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
        
        //make karel descends stairs dropping things on each step
        
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
