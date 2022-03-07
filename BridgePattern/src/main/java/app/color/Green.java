package app.color;

public class Green implements DrawAPI {
    @Override
    public void draw(int x, int y) {
        System.out.println("color:green, x: " +x+", "+ y +"]");
    }
}
