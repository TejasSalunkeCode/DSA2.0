package Interface;

public class CDPlayer implements media {
     @Override
    public void start(){
        System.out.println("music Start");
    }

     @Override
    public void stop(){
        System.out.println("music stop");
    }
}
