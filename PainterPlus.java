import org.code.neighborhood.*;

public class PainterPlus extends Painter{

  /* - turns the painter right
     - uses turnLeft three times
   */
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
}
