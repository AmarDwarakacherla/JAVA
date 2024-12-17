package Bot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class botExplain {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
//        int[] rev = bot.reverse(arr);
//        System.out.println(Arrays.toString(rev));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=10;i++){
            list.add(i);
        }
        int x = findOdd(list);
        System.out.println(x);
        ArrayList<Integer> res = oddEven(list);
        System.out.println(res);
    }

//    1, 2, 3, 4, 5, 6,7,8,9,10
    // 1, 3, 5, 7, 9, 2,4,6,8,10
    // 1 3 5 7
    static ArrayList<Integer> oddEven(ArrayList<Integer> list){
        ArrayList<Integer> odd  = new ArrayList<>(), even = new ArrayList<>(), t = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                even.add(list.get(i));
            }else{
                odd.add(list.get(i));
            }
        }
        for(int i=0;i<odd.size();i++) t.add(odd.get(i));
        for(int i=0;i<even.size();i++) t.add(even.get(i));
        return t;
    }


    static int  findOdd(ArrayList<Integer> list){
        int count = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2!=0){
                count++;
            }
        }
        return count;
    }



     static int[] reverse(int[] arr){
        int n = arr.length, t = 0;
        for(int i=0;i<n/2;i++){
            t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
        return arr;
    }
}
