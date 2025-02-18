package Bot.Charan;

import java.util.Arrays;

public class c33 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5,6,7};
        int k = 3;
        rightRotate(arr,k);
        System.out.print(Arrays.toString(arr));

    }
//    1,2,3,4,5
//
    public static void rightRotate(int[] arr,int k) {
        for(int j=0;j<k;j++) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
    }
}