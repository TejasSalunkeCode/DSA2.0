public class dsaproblem1 {
    public static void main(String[] args) {
int arr[]={23,45,43,11,78,5};
int target=78;
        System.out.println(sorted(arr, target, 0));
    }

   static boolean sorted(int[]arr,int target,int index){
    if(index==arr.length){
        return false;
    }
   return arr[index]==target || sorted(arr, target, index+1);
   }
}
