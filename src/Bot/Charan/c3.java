package Bot.Charan;

import java.util.Arrays;

public class c3 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static  void rotate(int arr[]){
        int first = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
    }
}

//Input:
//N = 5, array[] = {1,2,3,4,5}
//Output:
//        2,3,4,5,1
//Explanation:

