import org.code.neighborhood.*;

public class paintSmile extends PainterPlus{

  /* - paints the smile
     - goes row by row and uses for loops
   */
  
  public void paintSmile(){  
  
  for (int i = 0; i<4; i++){
    move();
  }

  turnRight();  

  //paints eyes

  for (int i = 0; i<5; i++){
    move();
  }

  paint("black");
  turnLeft();

  for (int i = 0; i<7; i++){
    move();
  }

  paint("black");

  //paints the smile

  turnRight();
  move();
  move();
  move();

  paint("black");
  move();
  turnRight();
  move();

  for (int i = 0; i<6; i++){
    paint("black");
    move();
  }

  turnRight();
  move();
  paint("black");
  move();
  
}
}

