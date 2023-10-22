package Cas3;

import java.time.LocalTime;

public class Reveil {
    private Etat etat;
    private LocalTime heureAlarme;
    private Boolean sonne;

    public Reveil() {
        this.sonne = false;
    }

    public Boolean getSonne() {
        return this.sonne;
    }

    public void changerEtat(Etat nouveauEtat) {
        this.etat = nouveauEtat;
    }

    public LocalTime getHeureAlarme() {
        return heureAlarme;
    }

    public void setHeureAlarme(LocalTime heureAlarme) {
        this.heureAlarme = heureAlarme;
    }
}
