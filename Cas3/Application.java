package Cas3;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Reveil reveil = new Reveil();
        reveil.changerEtat(new AlarmeSetup(reveil));
    }
}