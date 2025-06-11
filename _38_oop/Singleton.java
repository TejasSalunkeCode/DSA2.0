package _38_oop;

public class Singleton {
    private static Singleton instanse;
    private Singleton(){

    }


    public static Singleton getInstanse(){
        if(instanse==null){
            instanse=new Singleton();
        }
        return instanse;
    }

}
