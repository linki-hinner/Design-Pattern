package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class proxyHandler implements InvocationHandler {

    private RealImage realImage;

    public proxyHandler(RealImage realImage){
        this.realImage = realImage;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start displaying");
        Object result = method.invoke(realImage, args);
        System.out.println("end displaying");
        return result;
    }
}
