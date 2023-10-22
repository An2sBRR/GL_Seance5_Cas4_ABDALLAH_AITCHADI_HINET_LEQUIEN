package Cas3;

import static java.lang.Thread.sleep;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AlarmeOn extends Etat {

    public AlarmeOn(Reveil reveil) throws InterruptedException {
        super(reveil);
        while (true) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println(
                    "Il est actuellement: " + formatter.format(LocalTime.now()));
            if (formatter.format(LocalTime.now()).equals(reveil.getHeureAlarme().toString())) {
                reveil.changerEtat(new AlarmeSonne(reveil));
            }
            sleep(1000);
        }
    }
}
