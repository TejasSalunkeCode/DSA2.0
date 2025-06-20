package _40_oop;

public class subClass extends A{

    public subClass(int nums,String names){
            super(nums,names);
    }

    public static void main(String[] args) {
        A s1 = new subClass(3, "Yash");

        int n=s1.num;
        System.out.println(n);
    }
}

class subSubClass extends subClass{
    public subSubClass(int num,String name){
        super(num, name);
    }
    public static void main(String[] args) {
        subSubClass obj = new subSubClass(9, "sai");
        System.out.println(obj.num);
    }
}

class subClass2 extends A{
    public subClass2(int num,String name){
        super(num, name);
    }

    public static void main(String[] args) {
        subClass2 obj = new subClass2(5, "Om");
        System.out.println(obj.num);
    }

}
