import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public List getList() {
        return new CopyOnWriteArrayList();
    }

    @Override
    public Map getMap() {
        return new ConcurrentHashMap();
    }

    @Override
    public Deque getDeque() {
        return new LinkedList();
    }

}
