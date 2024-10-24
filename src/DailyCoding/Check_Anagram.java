package DailyCoding;

import java.util.Arrays;

public class Check_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram1("anagram","margana"));
        System.out.println(isAnagram2("anagram","margana"));
        System.out.println(isAnagram1("anagra","margana"));
        System.out.println(isAnagram2("amar","ramr"));
    }
    static boolean isAnagram1(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<s1.length();i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
    static boolean isAnagram2(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                return false;
            }
        }
        return true;
    }
}
