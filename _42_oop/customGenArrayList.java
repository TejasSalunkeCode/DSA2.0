package _42_oop;

import java.util.ArrayList;
import java.util.Arrays;

public class customGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public customGenArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            reSize();
        }
        data [size++]=num;
    }

    private void reSize(){
        Object []temp=new Object[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean  isFull(){
        return size==data.length;
    }

    private T removed(){
        T removed=(T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }
 
    public void set(int index, T value){
        data[index]=value;
    }

    @Override
    public String toString(){
        return "customGenArrayList{"+"data="+Arrays.toString(data)+", size= "+size+'}';
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        customGenArrayList list = new customGenArrayList();
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
