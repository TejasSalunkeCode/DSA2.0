package _38_oop;

public class InnerClasses {
    static class Test{
     String name;
     public Test(String name){
         this.name=name;
     }
    } 


   public static void main(String[] args) {
    Test a=new Test("Rahul");
    Test b=new Test("Tejas");
    // Test c=new Test("Om");

    System.out.println(a.name);
    System.out.println(b.name);
}
}

// static class   A {
    
// }