package Interface;

public class car implements Engine, breake,media {
    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    public void breake() {
        System.out.println("I break like a normal car");
    }

    public void stop() {
        System.out.println("I stop like a normal car");
    }

    public void start() {
        System.out.println("I start like a normal car");
    }

}