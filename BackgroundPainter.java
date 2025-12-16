import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus{

/*  - Combines painting to the right and the left
    - alternates between them to create a red background */
  public void paintBackground(){
    for (int i = 0; i<7; i++){
      moveRight();
      moveLeft();
    }
    moveRight();
    while(canMove()){
   paint("red");
   move();
  }
  paint("red");

  }

/*  - Painter moves to the right painting everything in its path
    - moves to next row */
public void moveRight(){
  while(canMove()){
   paint("red");
   move();
  }
  paint("red");
  turnRight();
  move();
  paint("red");
  turnRight();
  
}
/* - Painter moves to the right painting everything in its path, 
   - move to next row
 */
public void moveLeft(){
  while(canMove()){
   paint("red");
   move();
  }
  paint("red");
  turnLeft();
  move();
  paint("red");
  turnLeft();
}
  
}
