public class FactoryPatternDemo {
    public static void main(String[] args) {
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = ShapeFactory.getShape("CIRCLE");

        //调用 Circle 的 show 方法
        System.out.println(shape1.show());

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = ShapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 show 方法
        System.out.println(shape2.show());

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = ShapeFactory.getShape("SQUARE");

        //调用 Square 的 show 方法
        System.out.println(shape3.show());
    }
}
