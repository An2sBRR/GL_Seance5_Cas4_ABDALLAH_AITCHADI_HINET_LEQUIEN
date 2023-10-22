package Cas3;

import static java.lang.Thread.sleep;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AlarmOn extends State {

    public AlarmOn(Waker waker) throws InterruptedException {
        super(waker);
        while (true) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println(
                    "Il est actuellement: " + formatter.format(LocalTime.now()));
            if (formatter.format(LocalTime.now()).equals(waker.getAlarmHour().toString())) {
                waker.changeState(new AlarmRings(waker));
            }
            sleep(1000);
        }
    }
}
