package app;

public class SingleObject {
    private static class SingleObjectHolder {
        //创建 SingleObject 的一个对象
        private static final SingleObject INSTANCE = new SingleObject();
    }

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return SingleObjectHolder.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}