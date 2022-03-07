public class Student implements MyCompareAble{
    private int age = 0;
    @Override
    public boolean compareTo(Object o) {
        return o instanceof Student && this.age > ((Student) o).age;
    }
}
