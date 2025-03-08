import java.util.ArrayList;

public class LinnearTarget {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 13, 35, 27, 18, 35 };
        int target = 35;
        int index = 0;
        System.out.println(findtarget(arr, target, index));
        System.out.println(findIndex(arr, target, index));
        System.out.println(findLastIndex(arr, target, arr.length - 1));
        finAllIndex(arr, target, index);
        System.out.println(list);
        System.out.println(finAllIndex(arr, target, index, new ArrayList<>()));
    }

    static boolean findtarget(int[] arr, int target, int index) {
        if (index == arr.length) {
            System.out.println("hello");
            return false;
        }
        System.out.println("hii");
        return arr[index] == target || findtarget(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            // System.out.println("hello");
            return -1;
        }
        // System.out.println("hii");
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }

    }

    static int findLastIndex(int[] arr, int target, int index) {
        if (index == -1) {
            // System.out.println("hello");
            return -1;
        }
        // System.out.println("hii");
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
        }

    }

    //Way 1

    static ArrayList<Integer> list = new ArrayList<>();
    static void finAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
        list.add(index);
        } 
        finAllIndex(arr, target, index + 1);
    }



    //Way 2

    // static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer>finAllIndex(int[] arr, int target, int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
        list.add(index);
        } 
        return finAllIndex(arr, target, index + 1,list);
    }

}
