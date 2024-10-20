package DailyCoding.Bot;

import java.util.HashMap;
import java.util.Map;

public class Day_2_1 {
    public static void main(String[] args) {
        String str = "Amar Nath Reddy".replaceAll("\\s+","");
        int freq[] = new int[256];
        for(char ch : str.toCharArray()){
            freq[ch]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)(i) + " : "+freq[i]);
            }
        }

        //using HashMap
        System.out.println();
        HashMap<Character, Integer> frequency = new HashMap<>();
        for(char ch : str.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
