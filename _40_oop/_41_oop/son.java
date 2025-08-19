public class son extends parent {
    
    public son(int age){
        super(age);
        System.out.println(age);
    }

    @Override
    void normal(){
        super.normal();
    }
    
    @Override
    void carrer(){
        System.out.println("I am Going to be a Doctor");
    }


    @Override
    void partner(){
        System.out.println("I loved Iron man");
    }
}
