import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permutations("","abc");
        ArrayList<String> ans2=permutationsList("", "abc");
        System.out.println(ans2);
        int res=permutationCounters("", "abc");
        System.out.println(res);
    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s, up.substring(1));

        }
    }

    static ArrayList<String> permutationsList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans= new ArrayList<>();
        
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationsList(f+ch+s, up.substring(1)));

        }
        return ans;
    }

    static int permutationCounters(String p,String up){
        int count=0;
        // System.out.println(count);
        if(up.isEmpty()){
            // System.out.println(p);
            return 1;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
           count=count+(permutationCounters(f+ch+s, up.substring(1)));
           

        }
        return count;
    }





}
