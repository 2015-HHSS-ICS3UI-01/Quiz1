
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
 * @author lalim9800
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make City for robot 
        City quiz= new City();
        //new robot 
        Robot lali= new Robot(quiz,4,0,Direction.EAST);
        //make Walls
        
        new Wall(quiz,4,2,Direction.WEST);
        new Wall(quiz,4,2,Direction.NORTH);
        
        new Wall(quiz,3,3,Direction.WEST);
        new Wall(quiz,3,3,Direction.NORTH);
        
        new Wall(quiz,2,4,Direction.WEST);
        new Wall(quiz,2,4,Direction.NORTH);
        
        new Wall(quiz,2,5,Direction.NORTH);
        new Wall(quiz,2,5,Direction.EAST);
        
        new Wall(quiz,3,6,Direction.NORTH);
        new Wall(quiz,3,6,Direction.EAST);
        
        new Wall(quiz,4,7,Direction.EAST);
        new Wall(quiz,4,7,Direction.NORTH);
        
        //make thing 
        
       new Thing(quiz,4,1);
       new Thing(quiz,3,2);
       new Thing (quiz,2,3);
       new Thing (quiz,1,4);
       
       //make robot move and pick things
       
       lali.move();
       lali.pickThing();
       lali.turnLeft();
       lali.move();
       lali.turnLeft();
       lali.turnLeft();
       lali.turnLeft();
       lali.move();
       lali.pickThing();
        lali.turnLeft();
       lali.move();
       lali.turnLeft();
       lali.turnLeft();
       lali.turnLeft();
       lali.move();
       lali.pickThing();
       lali.turnLeft();
       lali.move();
       lali.turnLeft();
       lali.turnLeft();
       lali.turnLeft();
       lali.move();
       lali.pickThing();
       lali.move();
       
       //make robot move and put things 
     lali.putThing();
     lali.move();
     
     lali.turnLeft();
     lali.turnLeft();
     lali.turnLeft();
     lali.move();
     lali.putThing();
     lali.turnLeft();
     
     lali.move();
     lali.turnLeft();
     lali.turnLeft();
     lali.turnLeft();
     lali.move();
     lali.putThing();
     lali.turnLeft();
     
     lali.move();
     lali.turnLeft();
     lali.turnLeft();
     lali.turnLeft();
     lali.move();
     lali.putThing();
     lali.turnLeft();
     
     lali.move();
    }
}
