package _39_Inheritance;

public class mainn {
    public static void main(String[] args) {
        // information();
        Box obj1 = new Box(4, 5, 1);
        // Box obj2=new Box(obj1);
        // System.out.println(obj1.h+" "+obj1.l+""+obj1.w);

        // System.out.println(obj1.h + " " + obj1.l + " " + obj1.w);

        // BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.weight+ " "+box3.h);

        // BoxWeight box4 = new BoxWeight(3, 2, 5, 5);
        // System.out.println(box4.weight);

        Box box5 = new BoxWeight(2, 4, 5, 1);
        System.out.println(box5.h);

        // BoxWeight box6 = new Box(6,2,7);
        // System.out.println(box6.w);

    }
}
