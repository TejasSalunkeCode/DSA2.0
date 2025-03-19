public class ceilcharacter {
    public static void main(String[] args) {
        int []arr={'a','b','d','f','k','x'};
        int target='y';
        
        int ans=ceiling(arr, target);
        System.out.println(ans);
        // System.out.println();
    }
    static int ceiling(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

           if(target<arr[mid]){
            end=mid-1;
           }

           else if(target>arr[mid]){
               start=mid+1;
            }
    }
    return arr[start%arr.length];
}
}

