package behavioral.observer;

public class ACSystem implements Observer {
    @Override
    public void update(boolean occupied) {
        System.out.println(occupied ? "AC ON" : "AC OFF");
    }
}

