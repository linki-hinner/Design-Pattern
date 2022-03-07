package app.shape;

import app.color.DrawAPI;

public class square extends Shape{
    private final int x;
    private final int y;
    public square(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.print("[square ");
        drawAPI.draw(x, y);
    }
}
