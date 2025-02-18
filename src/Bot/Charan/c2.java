package Bot.Charan;

import java.util.Arrays;

public class c2 {

    public static void main(String[] args) {

        int[] arr= {1,1,2,2,2,3,3};
        System.out.println(Arrays.toString(arr));
        int x = dup(arr);
        System.out.println(x);
        System.out.println(Arrays.toString(arr));
        x = dup(arr);
        System.out.println(x);
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }

    }

//    1,1,1,2,2,3,3,3,3,4,4
    // 1 2 3 4
    public static int dup(int arr[]){
        int x = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[x] = arr[i];
                x++;
            }
        }
        return x;
    }








    public static int[] duplicate(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    c++;
                }
                if(c==0) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
        return arr;
    }

}