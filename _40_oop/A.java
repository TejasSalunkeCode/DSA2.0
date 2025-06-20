package _40_oop;

import java.util.Arrays;

public class A {
  protected int num;
    String name;
    int[]arr;

    public int getNum(){
        return num;
    }

    public void setNum(int num2){
        this.num=num2;
    }


    public A(int num,String name2){
        this.num=num;
        this.name=name2;
        this.arr= new int[num];

        System.out.println(name2);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
    }
}
