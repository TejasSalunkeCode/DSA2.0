
public class duplicate {

    public static void main(String[] args) {
        int[] arr = { 2, 1,3,4,3 };
        System.out.println(cyclicc(arr));
    }

    static int cyclicc(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i]!=i+1){

                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
