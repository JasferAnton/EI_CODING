package behavioral.observer;

public class LightSystem implements Observer {
    @Override
    public void update(boolean occupied) {
        System.out.println(occupied ? "Lights ON" : "Lights OFF");
    }
}
