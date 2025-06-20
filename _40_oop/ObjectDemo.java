package _40_oop;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // @Override
    // public String toString(){
    // return super.toString();
    // }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = obj;

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

    }
}
