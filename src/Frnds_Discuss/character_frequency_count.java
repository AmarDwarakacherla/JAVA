package Frnds_Discuss;

import java.util.HashMap;
import java.util.Map;

public class character_frequency_count {
    public static void main(String[] args) {
        countFrequencyApproach2("Amar nath reddy");
    }

    public static void countFrequencyApproach1(String str) {
        int[] count = new int[256]; // ASCII size
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }
        for(int i=0;i<256;i++){
            if(count[i]>0){
                if(i==32) continue;
                System.out.println((char) i + " -> " + count[i]);
            }
        }
    }

    public static void countFrequencyApproach2(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getKey()==' ') continue;
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
