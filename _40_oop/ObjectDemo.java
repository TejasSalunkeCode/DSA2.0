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
        return this.num==((ObjectDemo)obj).num;
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
        ObjectDemo obj2 = new ObjectDemo(34);

        if(obj==obj2){
            System.out.println("Hello");
        }
         if(obj.equals(obj2)){
            System.out.println("Hello 2");
        }

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

    }
}
