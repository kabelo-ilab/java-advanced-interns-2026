package Chapter7.Interfaces;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class ShapeRunner {
    public static void main(String[] args) {
        MySquare objSquare = new MySquare(5);
        objSquare.draw();
        objSquare.apply("\u001B[32m");//Green Color
        objSquare.display();

        MyCircle objCircle = new MyCircle(7);
        objCircle.draw();
        objCircle.apply("\u001B[31m");//Red Color
        objCircle.display();
    }
}
