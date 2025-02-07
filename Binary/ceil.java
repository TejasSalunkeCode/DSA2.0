public class ceil {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18};
        int target=14;
        int ans=search(arr, target);
        System.out.println(ans);

    }
    static int search(int []arr , int target){
        int start=0;
        int end=(arr.length)-1;
        int mid=((start+end)/2);

        if(target==arr[mid]){
            return target;
        }

        while(start<=end) {
              if(target>arr[mid]){
                start=mid+1;

              }  
              if(target<arr[mid]){
                end=mid-1;
              }
        }

        return 1;
    }
}
 















// public class ceil {
//     public static void main(String[] args) {
//         int []arr = {2, 3, 5, 9, 14, 16, 18};
//         int target = 14;
//         int ans = search(arr, target);
//         System.out.println(ans);  // This will print the index of the target, or -1 if not found.
//     }

//     static int search(int[] arr, int target) {
//         int start = 0;  // Start index should be 0.
//         int end = arr.length - 1;  // End index should be arr.length - 1.
        
//         while (start <= end) {
//             int mid = (start + end) / 2;  // Calculate mid inside the loop.

//             if (arr[mid] == target) {
//                 return mid;  // Return the index of the target if found.
//             } 
            
//             if (arr[mid] < target) {
//                 start = mid + 1;  // Search in the right half.
//             } else {
//                 end = mid - 1;  // Search in the left half.
//             }
//         }

//         return -1;  // Return -1 if the target is not found.
//     }
// }
