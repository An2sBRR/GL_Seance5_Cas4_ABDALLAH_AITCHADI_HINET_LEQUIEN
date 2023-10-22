package Cas3;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Reveil reveil = new Reveil("17:21");
        reveil.changerEtat(new AlarmeOn(reveil));
    }
}