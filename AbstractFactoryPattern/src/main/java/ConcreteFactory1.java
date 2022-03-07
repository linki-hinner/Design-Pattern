import java.util.*;

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public List getList() {
        return new ArrayList();
    }

    @Override
    public Map getMap() {
        return new HashMap();
    }

    @Override
    public Deque getDeque() {
        return new ArrayDeque();
    }
}
