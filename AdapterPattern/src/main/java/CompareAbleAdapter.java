public class CompareAbleAdapter implements Comparable{
    private final MyCompareAble myCompareAble;

    public CompareAbleAdapter(MyCompareAble myCompareAble) {
        this.myCompareAble = myCompareAble;
    }

    @Override
    public int compareTo(Object o) {
        return myCompareAble.compareTo(o) ? 1 : -1;
    }
}
