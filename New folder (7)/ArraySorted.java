public class ArraySorted {
    public static void main(String[] args) {
        int[]arr={3,5,7,9,11,44,56};
        System.out.println(issorted(arr,0));
    }   
    
    static boolean issorted(int[]arr,int index){
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && issorted(arr, index+1);
    }   
}
