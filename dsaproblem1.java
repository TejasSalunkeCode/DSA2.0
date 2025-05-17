public class dsaproblem1 {
    public static void main(String[] args) {
int arr[]={23,45,43,11,78,5};
int target=78;
        System.out.println(sorted(arr, target, 0));
        System.out.println(findd(arr, target, 0));
    }

   static boolean sorted(int[]arr,int target,int index){
    if(index==arr.length){
        return false;
    }
   return arr[index]==target || sorted(arr, target, index+1);
   }

    static int findd(int[]arr,int target,int index){
    if(index==arr.length){
        return -1;
    }
    if(arr[index]==target){
        return index;
    }
    else{
        return findd(arr, target, index+1);
    }
   }
}
