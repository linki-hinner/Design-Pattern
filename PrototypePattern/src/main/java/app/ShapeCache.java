package app;

import com.google.common.collect.Maps;
import share.Circle;
import share.Rectangle;
import share.Shape;
import share.Square;

import java.util.Map;

public class ShapeCache {
    private static final Map<String, Shape> shapeMap = Maps.newConcurrentMap();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
