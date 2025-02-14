public class allMissing {
    public static void main(String[] args) { 
        int []arr={3,2,3,4,1,2,7,0};
        System.out.println(Missing(arr)); 
    }
    static int Missing(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }        
        }
        for (int j = 0; j < arr.length; j++) {
            int temp2=0;
            if(arr[j]!=j){
                temp2=temp2+arr[j];
            }
            return temp2;
        }
        return arr.length;
}

static void swap(int[]arr,int first, int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
}