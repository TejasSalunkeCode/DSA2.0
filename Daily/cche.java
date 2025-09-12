import java.util.HashSet;

public class cche {
    public static void main(String[] args) {
        int n1 = 2;
        int[][] languages1 = {{1}, {2}, {1, 2}};
        int[][] friendships1 = {{1, 2}, {1, 3}, {2, 3}};
        System.out.println(minimumTeachings(n1, languages1, friendships1));
    }

     static int minimumTeachings(int n, int[][] languages, int[][] friendships) {

       Set<integer> users = new HashSet<>();
        for(int[] f : friendships){
            int u1=f[0]-1;
            int[]l1=languages[u1];
            int u2=f[1]-1;
            int[]l2=languages[u2];

            if()

        }
    }

    int result = Integer.MAX_VALUE;
    for(int l=1;l<=n;l++){
        int count=0;
        for(int user : users){
            if(!Konows(languages[u1],l)){
                count+=1;
            }
        }
        result=Math.min(result, count);
    }
}
