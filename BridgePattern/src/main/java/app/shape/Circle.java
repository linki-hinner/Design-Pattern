package app.shape;

import app.color.DrawAPI;

public class Circle extends Shape {
    private int x, y;

    public Circle(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.print("[circle ");
        drawAPI.draw(x,y);
    }
}
