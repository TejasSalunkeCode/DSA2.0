public class LinnearTarget {
    public static void main(String[] args) {
       int[] arr={2,5,13,35,27,18};
       int target=18; 
       int index=0;
    //    System.out.println(findtarget(arr, target,index));
       System.out.println(findIndex(arr, target, index));
    }
    static boolean findtarget(int[]arr,int target,int index){
        if(index==arr.length){
            System.out.println("hello");
            return false;
        }
        System.out.println("hii");
        return arr[index]==target || findtarget(arr, target, index+1);
    }

    static int findIndex(int[]arr,int target,int index){
        if(index==arr.length){
            // System.out.println("hello");
            return -1;
        }
        // System.out.println("hii");
        if(arr[index]==target ){
            return index;
        }else{
            return findIndex(arr, target, index+1);
        }
        
    }
}
