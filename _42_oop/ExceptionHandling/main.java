package _42_oop.ExceptionHandling;

public class main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            String name="Tejas";
            if(name.equals("Tejas")){
                throw new Exception("Name is Tejas : ");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Normal Exception");
        }
        finally{
            System.out.println("this will alaways execute");
        } 
    }

    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by Zero");
        }

        return a/b;
    }
}
