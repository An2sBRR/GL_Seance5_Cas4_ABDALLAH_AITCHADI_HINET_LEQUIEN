package Cas3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reveil {
    private Etat etat;
    private LocalTime heureAlarme;
    private Boolean sonne;

    public Reveil(String heureAlarme) {
        this.sonne = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        this.heureAlarme = LocalTime.parse(heureAlarme, formatter);
    }

    public Boolean getSonne() {
        return this.sonne;
    }

    public void changerEtat(Etat nouveauEtat) {
        this.etat = nouveauEtat;
    }

    public void afficherAlarme() {
        System.out.println("Voici l'heure de l'alarme : " + this.heureAlarme);
    }

    public void programmerAlarme(String heureAlarme) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        this.heureAlarme = LocalTime.parse(heureAlarme, formatter);
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public LocalTime getHeureAlarme() {
        return heureAlarme;
    }

    public void setHeureAlarme(LocalTime heureAlarme) {
        this.heureAlarme = heureAlarme;
    }
}
