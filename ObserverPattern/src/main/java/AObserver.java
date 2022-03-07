public class AObserver extends Observer{

    public AObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "a String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}