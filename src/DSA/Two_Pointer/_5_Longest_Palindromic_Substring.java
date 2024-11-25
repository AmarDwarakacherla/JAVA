package DSA.Two_Pointer;

public class _5_Longest_Palindromic_Substring {
    public static void main(String[] args) {
        System.out.println(longestPalindromeApprach1("babad"));

    }
    static public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String LPS = "", palindrome = "";
        int low=0, high=0;
        for(int i=1;i<s.length();i++){
            // for the odd length;
            low = i; high = i;
            while(s.charAt(low)==s.charAt(high)){
                low--;high++;
                if(low == -1 || high == s.length()) break;
            }
            palindrome = s.substring(low+1, high);
            if(LPS.length()<palindrome.length())
                LPS = palindrome;
            // for even length
            low = i-1; high = i;
            while(s.charAt(low)==s.charAt(high)){
                low--;high++;
                if(low == -1 || high == s.length()) break;
            }
            palindrome = s.substring(low+1, high);
            if(LPS.length()<palindrome.length())
                LPS = palindrome;
        }
        return LPS;
    }
    static String longestPalindromeApprach2(String s) {
        return " ";
    }
}
