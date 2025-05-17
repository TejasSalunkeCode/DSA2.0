import java.util.ArrayList;

public class addToList {
    public static void main(String[] args) {
       int[]arr={2,3,4,4,5};
       System.out.println(findallindex(arr, 4, 0, new ArrayList<>())); 
    }
    static ArrayList<Integer> findallindex(int[]arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return findallindex(arr, target, index+1, list);
    }
}
