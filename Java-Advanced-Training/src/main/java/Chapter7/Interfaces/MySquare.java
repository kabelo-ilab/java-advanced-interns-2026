package Chapter7.Interfaces;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class MySquare extends MyShape implements IShapeCalculation, IGraphics {

    public MySquare(int side) {
        super(side, 0);
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public void apply(String color) {
        System.out.println("Applying " + color + " color");
    }

    @Override
    public void draw() {
        System.out.println("Drawing the square");

    }

    @Override
    public void display() {
        System.out.println("Side: " + this.length);
        System.out.println("Area: " + getArea());
        System.out.println("====================================");
    }
}
