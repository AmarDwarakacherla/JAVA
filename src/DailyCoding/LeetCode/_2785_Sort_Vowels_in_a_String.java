package DailyCoding.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2785_Sort_Vowels_in_a_String {
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));

    }
    public static String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        String vow = "AEIOUaeiou";
        for(char c : s.toCharArray()){
            if(vow.contains(String.valueOf(c)))
                vowels.add(c);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Collections.sort(vowels);
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1)
                sb.append(vowels.get(i++));
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
