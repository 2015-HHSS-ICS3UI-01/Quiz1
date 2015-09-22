
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
 * @author moore3607
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new city called kw
        City kw = new City();
        //created a new Robot called beep
        Robot beep = new Robot(kw,4,0,Direction.EAST);
        //created walls
      new Wall(kw,4,2,Direction.WEST);
      new Wall(kw,4,2,Direction.NORTH);
      new Wall(kw,3,3,Direction.WEST);
      new Wall(kw,3,3,Direction.NORTH);
      new Wall(kw,2,4,Direction.WEST);
      new Wall(kw,2,4,Direction.NORTH);
      new Wall(kw,2,5,Direction.NORTH);
      new Wall(kw,2,5,Direction.EAST);
      new Wall(kw,3,6,Direction.NORTH);
      new Wall(kw,3,6,Direction.EAST);
      new Wall(kw,4,7,Direction.NORTH);
      new Wall(kw,4,7,Direction.EAST);
      //created things
      new Thing(kw,4,1);
      new Thing(kw,3,2);
      new Thing(kw,2,3);
      new Thing(kw,1,4);
      
      //all commands below will be executed no matter what
      while(true){
          
          beep.move();
          //command will be executed if beep is standing on a thing
          if(beep.canPickThing()){
              beep.pickThing();
          }
          //command will be executed if beep is in the given location
          if(beep.getStreet()==1){
              if(beep.getAvenue()==4){
                  //breaks the program out of the "while loop"
                  break;
              }
          }
          
          beep.turnLeft();
          beep.move();
          beep.turnLeft();
          beep.turnLeft();
          beep.turnLeft();

              }
      
      beep.move();
      beep.putThing();
      
      //all commands below will be executed no matter what
      while(true){
          
          
      beep.move();
      //command will be executed if beep is in the given location
      if(beep.getAvenue()==9){
          if(beep.getStreet()==4){
              //breaks the program out of the "while loop"
              break;
          }
      }
      beep.turnLeft();
      beep.turnLeft();
      beep.turnLeft();
      beep.move();
      beep.putThing();
      beep.turnLeft();
      
      
      }
              
          
      }
      
        
        
    }

