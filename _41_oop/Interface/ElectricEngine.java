package Interface;

public class ElectricEngine implements Engine {
      @Override
    public void start(){
        System.out.println("ElectricEngine Start");
    }

     @Override
    public void acc(){
        System.out.println("ElectricEngine accelerate");
    }

     @Override
    public void stop(){
        System.out.println("ElectricEngine stop");
    }
}
