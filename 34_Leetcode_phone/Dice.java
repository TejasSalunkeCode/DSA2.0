import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("", 4));
        System.out.println(diceRet2("", 4));
    }   
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dice(p+i, target-i);
        }
    } 

     static ArrayList<String> diceRet(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            // System.out.println(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
           ans.addAll(diceRet(p+i, target-i));
        }
        return ans;
    }
    
    

    
     static int diceRet2(String p,int target){
        if(target==0){

            // System.out.println(p);
            return 1;
        }
        int count=0;
        for (int i = 1; i <=6 && i<=target; i++) {
        count=count+(diceRet2(p+i, target-i));
        }
        return count;
    }

    
}

