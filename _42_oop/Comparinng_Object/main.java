package _42_oop.Comparinng_Object;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Student tejas = new Student(24, 95);
        Student om = new Student(57, 100);
        Student sai = new Student(17, 87);
        Student yash = new Student(23, 99);
        Student shubh = new Student(69, 90);
        Student aditya = new Student(35, 85);

         Student[] list={tejas,om,sai,yash,aditya,shubh};
         System.out.println(Arrays.toString(list));
         Arrays.sort(list);
         System.out.println(Arrays.toString(list));

        if (tejas.compareTo(om) < 0) {
            System.out.println(tejas.compareTo(om));
            System.out.println("om has more marks");
        }
    }
}
