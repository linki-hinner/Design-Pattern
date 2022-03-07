

public class BObserver extends Observer{

    public BObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "B String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}