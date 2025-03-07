import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        findFact(20);
        findFact2(20);
        findFact3(20);
    }
    static void findFact(int n){

        int count=1;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
            count++;
        }
        System.out.print("loop "+count);
        System.out.println();
    }


    static void findFact2(int n){

        int count=0;
        for (int i = 1; i <Math.sqrt(n); i++) {
            if(n%i==0){
                if(n%i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
            count++;
        }
        System.out.println("loop "+count);
    }


    static void findFact3(int n){
        ArrayList<Integer> list= new ArrayList<>();
        // int count=0;
        for (int i = 1; i <Math.sqrt(n); i++) {
            if(n%i==0){
                if(n%i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
            // count++;
        }
        // System.out.println("loop "+count);

        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }

}
