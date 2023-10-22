package Cas3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmSetup extends State {

    public AlarmSetup(Waker waker) throws InterruptedException {
        super(waker);
        try (Scanner scanner = new Scanner(System.in)) {
            while (waker.getAlarmHour() == null) {
                System.out.println("Quelle heure souhaitez-vous parametrer? format Heure:minutes");
                String hour = scanner.nextLine();
                if (!hour.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")) {
                    waker.setAlarmHour(null);
                    System.out.println("veuillez entrer une valeur correcte");
                } else {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                    waker.setAlarmHour(LocalTime.parse(hour, formatter));
                    waker.changeState(new AlarmOn(waker));
                }
            }
        }
    }
}
