public abstract class parent {

    int age;
    final int VALUE;
    public parent(int age){
        this.age=age;
        VALUE=23456789;
    }

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("this is a normal meathod");
    }
    

    abstract void carrer();
    abstract void partner();
}
