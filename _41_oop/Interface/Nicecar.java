package Interface;

public class Nicecar {
    private Engine engine;
    private media player = new CDPlayer();

    public Nicecar(){
        engine = new powerEngine();
    }

    public Nicecar(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startmusic(){
        player.start();
    }

    public void upgardeEngine(){
        this.engine=new ElectricEngine();
}
}
