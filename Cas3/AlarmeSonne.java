package Cas3;

import java.util.Scanner;

public class AlarmeSonne extends Etat {

    public AlarmeSonne(Reveil reveil) throws InterruptedException {
        super(reveil);
        Boolean isRinging = true;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("BIP BIP BIP");
                System.out.println("Désactiver l'alarme? oui/non");
                if (scanner.nextLine().equals("oui")) {
                    isRinging = false;
                    this.reveil.changerEtat(new AlarmeOff(this.reveil));
                }
            } while (isRinging);
        }
    }
}
