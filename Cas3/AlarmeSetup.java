package Cas3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmeSetup extends Etat {

    public AlarmeSetup(Reveil reveil) throws InterruptedException {
        super(reveil);
        try (Scanner scanner = new Scanner(System.in)) {
            while (reveil.getHeureAlarme() == null) {
                System.out.println("Quelle heure souhaitez-vous parametrer? format Heure:minutes");
                String heure = scanner.nextLine();
                if (!heure.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")) {
                    reveil.setHeureAlarme(null);
                    System.out.println("veuillez entrer une valeur correcte");
                } else {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                    reveil.setHeureAlarme(LocalTime.parse(heure, formatter));
                    reveil.changerEtat(new AlarmeOn(reveil));
                }
            }
        }
    }
}
