package Cas3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Etat {
    protected Reveil reveil;

    public Etat(Reveil reveil) {
        this.reveil = reveil;
    }

    void afficherHeure() {
        System.out.println("Voici l'heure : " + LocalTime.now());
    }

    void programmerAlarme(String heureAlarme) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        this.reveil.setHeureAlarme(LocalTime.parse(heureAlarme, formatter));
    }

    void activerAlarme() {

    }

    void desactiverAlarme() {

    }
}
