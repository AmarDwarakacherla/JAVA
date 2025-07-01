package Frnds_Discuss;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        System.out.println(findLongestApproach2("Amarnath"));
    }
    public static int findLongestApproach1(String str) {
        int max = Integer.MIN_VALUE;
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            boolean[] check = new boolean[256];
            for (int j = i; j < s.length; j++) {
                if (check[s[j]]) break;
                else {
                    max = Math.max(max, j - i + 1);
                    check[s[j]] = true;
                }
            }
        }
        return max != Integer.MIN_VALUE ? max : -1;
    }

    public static int findLongestApproach2(String str){
        Set<Character> charSet = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int right = 0;right<str.length();right++){
            while(charSet.contains(str.charAt(right))){
                charSet.remove(str.charAt(left));
                left++;
            }
            charSet.add(str.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max;
    }

}
