package Chapter7.Interfaces;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/12
 **/
public class MyCircle extends MyShape implements IGraphics, IShapeCalculation {

    public MyCircle(double radius) {
        super(0, radius);
    }

    @Override
    public void apply(String color) {
        System.out.println("Applying " + color + " color");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void display() {
        System.out.println("Radius: " + this.width);
        System.out.println("Area: " + getArea());
        System.out.println("====================================");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.width, 2);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
