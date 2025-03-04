public class MissingPossitive {
    public static void main(String[] args) { 
        int []arr={0,3,1,2};
        System.out.println(Missing(arr)); 
    }
    static int Missing(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
              
                i++;
            }        
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length+1;
}

static void swap(int[]arr,int first, int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
}