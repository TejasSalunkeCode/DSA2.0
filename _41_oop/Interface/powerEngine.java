package Interface;

public class powerEngine implements Engine{
    @Override
    public void start(){
        System.out.println("PowerEngine Start");
    }

     @Override
    public void acc(){
        System.out.println("PowerEngine accelerate");
    }

     @Override
    public void stop(){
        System.out.println("PowerEngine stop");
    }
}
