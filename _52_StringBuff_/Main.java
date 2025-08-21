package _52_StringBuff_;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        //constructor 2
        StringBuffer sb2 = new StringBuffer("Kunal Kushwaha");
        // System.out.println(sb2.capacity());

        //constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("WeMakeDevs");
        sb.append(" is nice");

        // sb.insert(2, " rahul ");
        sb.replace(1, 5, "salunke ");
        sb.delete(1, 5);

        // sb.reverse();
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        int n=20;
        String name = RandomString.generate(n);
        System.out.println(name);


        //remove whitespaces

        String sentence ="Hi hh  h   jk   ghsb     r";

        //split

        String arr="Tejas,Om,Yash,Mohit,Shubh";
        String[]names=arr.split(" ,");
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));

    }
}
