package Cas3;

import java.util.Scanner;

public class AlarmRings extends State {

    public AlarmRings(Waker waker) throws InterruptedException {
        super(waker);
        Boolean isRinging = true;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("BIP BIP BIP");
                System.out.println("Désactiver l'alarme? oui/non");
                if (scanner.nextLine().equals("oui")) {
                    isRinging = false;
                    this.waker.changeState(new AlarmOff(this.waker));
                }
            } while (isRinging);
        }
    }
}
