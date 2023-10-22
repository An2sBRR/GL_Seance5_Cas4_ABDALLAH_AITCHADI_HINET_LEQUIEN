package Cas3;

public class AlarmeOff extends Etat {

    public AlarmeOff(Reveil reveil) throws InterruptedException {
        super(reveil);
        reveil.setHeureAlarme(null);
        reveil.changerEtat(new AlarmeSetup(reveil));
    }
}