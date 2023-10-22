package Cas3;

import java.util.Scanner;

public class AlarmeSonne extends Etat {

    public AlarmeSonne(Reveil reveil) throws InterruptedException {
        super(reveil);
        Boolean isRinging = true;
        do {
            System.out.println("BIP BIP BIP");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Désactiver l'alarme? oui/non");
            if (scanner.nextLine().equals("oui")) {
                isRinging = false;
                desactiverAlarme();
            }
        } while (isRinging);
    }

    @Override
    public void desactiverAlarme() {
        this.reveil.changerEtat(new AlarmeOff(this.reveil));
    }
}
