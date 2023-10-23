package Cas3;

public class AlarmOff extends State {

    public AlarmOff(Waker waker) throws InterruptedException {
        super(waker);
        waker.setAlarmHour(null);
        waker.changeState(new AlarmSetup(waker));
    }
}