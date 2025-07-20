package _42_oop;

import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public customArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            reSize();
        }
        data [size++]=num;
    }

    private void reSize(){
        int []temp=new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean  isFull(){
        return size==data.length;
    }

    private int removed(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
 
    public void set(int index, int value){
        data[index]=value;
    }

    @Override
    public String toString(){
        return "customArrayList{"+"data="+Arrays.toString(data)+", size= "+size+'}';
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        customArrayList list = new customArrayList();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);

        for (int i = 0; i < 14; i++) {
            list.add(i*2);
        }

        System.out.println(list);
        

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Tejas");
        System.out.println(list2);

    }
}
