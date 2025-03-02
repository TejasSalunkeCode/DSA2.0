public class sqroott {
        public static void main(String[] args) {
            System.out.println(displaynum(125));
            System.out.println(displaynum(25));
            System.out.println(displaynum(625));
        }
        public static int displaynum(int n){
            for (int i = 0; i < n; i++) {
                if(i*i==n){
                    return i;
                }
            }
            return -1;
    
        }
    }
    

