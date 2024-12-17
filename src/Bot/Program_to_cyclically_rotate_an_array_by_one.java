package Bot;

import java.util.Arrays;

public class Program_to_cyclically_rotate_an_array_by_one {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cyclicRotate(new int[]{1,2,3,4,5})));
    }
    static int[] cyclicRotate(int[] arr){
        //1 2 3 4 5
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        return arr;

    }

}
