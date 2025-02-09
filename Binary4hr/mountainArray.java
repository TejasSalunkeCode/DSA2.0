public class mountainArray {
    public static void main(String[] args) {
        // int[] arr={7,9,11,11,19,88,97,117,124,888,6};
        int[] arr={11,23,45,67,100,7,6,5,4,3,2,-9};
        int target=0;
        int temp=0;
        // System.out.println(search(arr,target));
        System.out.println(search(arr, target,temp));
    }
    static int search(int[]arr,int target,int temp){
        int start=0;
        int end=arr.length-1;
        // int target;
        while (start<=end) {
            int mid=((start+end)/2);
            System.out.println(mid);
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
                target=arr[mid+1];
                temp=arr[mid];
                 //return arr[mid+1];
            }
           else if(arr[mid]>arr[mid+1]){
               end=mid-1;
            //    return arr[mid];
            target=arr[mid-1];
            temp=arr[mid];
            }
            // else{
            // //     // return arr[mid];
            //  return target;
            // }
            if(temp>target){
                return temp;
            }
        }
        return target;
        // return temp;
       
    }
}
