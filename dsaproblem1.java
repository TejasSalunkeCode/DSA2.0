public class dsaproblem1 {
       public static void main(String[] args) {
   int ans=twoSum(81,9);
   
    }
        public int[] twoSum(int[] nums, int target) {
            int[]arr={0,0};
         //   int target;
            for(int i=0;i<=arr.length;i++){
                for(int j=0;j<=arr.length;j++){
                    if(arr[i]+arr[j]==target){
                        return arr;
                    }
                }
            }
        } 
    }

