package app.color;

public class Red implements DrawAPI {
    @Override
    public void draw(int x, int y) {
        System.out.println("color:red, x: " +x+", "+ y +"]");

    }
}
