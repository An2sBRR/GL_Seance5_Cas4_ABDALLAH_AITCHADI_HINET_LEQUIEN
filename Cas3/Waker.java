package Cas3;

import java.time.LocalTime;

public class Waker {
    private State state;
    private LocalTime alarmHour;

    public Waker() {
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public LocalTime getAlarmHour() {
        return alarmHour;
    }

    public void setAlarmHour(LocalTime hour) {
        this.alarmHour = hour;
    }
}
