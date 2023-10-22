package Cas3;

public abstract class State {
    protected Waker waker;

    public State(Waker reveil) {
        this.waker = reveil;
    }
}
