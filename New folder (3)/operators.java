import java.util.ArrayList;

public class operators {
public static void main(String[] args) {
    System.out.println('a'+'b');
    System.out.println('a');
    System.out.println("a"+"b");
    System.out.println((char)('a'+3));

    System.out.println("a"+1);
    //this is same as after a few steps : "a" + "b"
    //integer will be converted to Integer that will call toString()

    System.out.println("Tejas "+ new ArrayList<>());
    System.out.println("Tejas"+new Integer(67));
    String ans=new Integer(90)+""+new ArrayList<>();
    System.out.println(ans);
}    
}
