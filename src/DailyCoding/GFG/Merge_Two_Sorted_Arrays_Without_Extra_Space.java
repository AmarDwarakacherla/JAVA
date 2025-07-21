package DailyCoding.GFG;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays_Without_Extra_Space {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 7, 10};
        int[] b = new int[]{2, 3};
        merge(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
    public static void merge(int[] a, int[] b){
        for(int i=b.length-1;i>=0;i--){
            if(a[a.length-1]>b[i]){
                int temp = a[a.length-1];
                int j = a.length-2;
                while(j>=0 && a[j]>b[i]){
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = b[i];
                b[i] = temp;
            }
        }
    }
}
