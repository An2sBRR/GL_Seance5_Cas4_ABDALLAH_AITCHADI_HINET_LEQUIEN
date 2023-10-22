package Cas3;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Waker reveil = new Waker();
        reveil.changeState(new AlarmSetup(reveil));
    }
}