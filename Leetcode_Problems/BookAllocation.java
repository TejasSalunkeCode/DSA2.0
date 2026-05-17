import java.util.Arrays;

public class BookAllocation {
    public static void main(String[] args) {
int[] books = {12, 34, 67, 90};
    int n = books.length;
    int m = 2;   // number of students

    int result = findPage(books, n, m);

    if (result == -1) {
        System.out.println("Not possible to allocate books");
    } else {
        System.out.println("Minimum maximum pages = " + result);
    }
    }
    public static int couuntStudent(int[]arr,int pages){
        int student=1;
        long pagesStudent=0;

        for (int i = 0; i < arr.length; i++) {
            if(pagesStudent+arr[i]<=pages){
                pagesStudent+=arr[i];
            }else{
                student++;
                pagesStudent+=arr[i];
            }
        }
        return student;
    }

    public static int findPage(int[]arr,int n,int m){
        if(m>n) return  -1;

        int low=Arrays.stream(arr).max().getAsInt();
        int high=Arrays.stream(arr).sum();

        while (low<=high) {
            int mid=low+(high-low)/2;
            int students=couuntStudent(arr, mid);

            if(students>m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
