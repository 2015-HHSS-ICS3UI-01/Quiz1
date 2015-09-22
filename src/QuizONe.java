
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
 * @author bettk6516
 */
public class QuizONe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    City jw=new City();
    //makes city
    Robot rob=new Robot(jw,4,0,Direction.EAST);
    //places robot in city at 4,0 facing east
    new Wall(jw,4,2,Direction.WEST);
    new Wall(jw,4,2,Direction.NORTH);
    new Wall(jw,3,3,Direction.WEST);
    new Wall(jw,3,3,Direction.NORTH);
    new Wall(jw,2,4,Direction.WEST);
    new Wall(jw,2,4,Direction.NORTH);
    new Wall(jw,2,5,Direction.NORTH);
    new Wall(jw,2,5,Direction.EAST);
    new Wall(jw,3,6,Direction.NORTH);
    new Wall(jw,3,6,Direction.EAST);
    new Wall(jw,4,7,Direction.NORTH);
    new Wall(jw,4,7,Direction.EAST);
    //adds the walls 
    
    new Thing(jw,4,1);
    new Thing(jw,3,2);
    new Thing(jw,2,3);
    new Thing(jw,1,4);
    //adds things for rob to pick up
    
    rob.move();
    rob.pickThing();
    rob.turnLeft();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.pickThing();
    rob.turnLeft();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.pickThing();
    rob.turnLeft();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.pickThing();
    rob.move();
    rob.putThing();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putThing();
    rob.turnLeft();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putThing();
    rob.turnLeft();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putThing();
    rob.turnLeft();
    rob.move();
    //rob moves picks up the Things then places them down where told
    
    
    
    
    }
}
