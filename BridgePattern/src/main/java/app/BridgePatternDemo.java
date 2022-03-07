package app;


import app.color.Green;
import app.color.Red;
import app.shape.Circle;
import app.shape.Shape;
import app.shape.square;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, new Red());
        Shape greenCircle = new Circle(100,100,  new Green());
        redCircle.draw();
        greenCircle.draw();

        Shape redSquare = new square(100,100,  new Red());
        Shape greenSquare  = new square(100,100,  new Green());
        redSquare.draw();
        greenSquare.draw();
    }
}
