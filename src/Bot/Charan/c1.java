package Bot.Charan;

import java.util.*;
public class c1 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,5,10,2,25,30};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(secondsmallest(arr));
    }
    public static void bubbleSort(int arr[]){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
// 1,5,10,2,25,30
    public static int small(int[] arr){
        int smallest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    // 1,5,10,2,25,30
    public static int secondsmallest(int[] arr){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]<second && first<second){
                second = arr[i];
            }
        }
        return second;
    }



}