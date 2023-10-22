package Cas3;

public class AlarmOf extends State {

    public AlarmOf(Waker waker) throws InterruptedException {
        super(waker);
        waker.setAlarmHour(null);
        waker.changeState(new AlarmSetup(waker));
    }
}