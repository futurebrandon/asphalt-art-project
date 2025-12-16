import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //creates painter to paint background

    BackgroundPainter A = new BackgroundPainter();
    A.setPaint(1000000);
    A.paintBackground();

    //creates painter to paint the smile

    paintSmile B = new paintSmile();
    B.setPaint(1000000);
    B.paintSmile();
  }

}