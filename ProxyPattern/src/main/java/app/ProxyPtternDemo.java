package app;

import proxy.Image;
import proxy.RealImage;
import proxy.proxyHandler;

import java.lang.reflect.Proxy;

public class ProxyPtternDemo {
    public static void main(String[] args) {
        Image image = (Image) Proxy.newProxyInstance(
                Image.class.getClassLoader(),
                new Class<?>[]{Image.class},
                new proxyHandler(new RealImage("test_10mb.jpg"))
        );

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}


