package DailyCoding;

import java.util.HashMap;
import java.util.Map;

public class Finding_Frequency {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,3,4,4,5,5,5};
        System.out.println("Approach1");
        Approach1(arr);
        System.out.println("Approach2");
        Approach2(arr);
    }
    public static void Approach1(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            else{
                freq.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void Approach2(int[] arr){
        int[] freq = new int[1000];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+" : "+freq[i]);
            }
        }
    }
}
