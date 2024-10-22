package DailyCoding;
//Smallest Substring
//Geek has a string "str" of lowercase letters and an integer k. He wants to find out the substring of length k, with the lowest score. The score of a string is the sum of the ASCIl value of each character present in the string. Help him to find out the substring. If multiple substrings have the same score, select the one with the smallest starting index.
//Example 1:
//Input:
//str = "hello"
//k = 2
//Output:
//he
//Explanation: The substrings of length k = 2, are "he", "el", "Il", "lo". The score of
//"he" is 205, "el" is 209, "Il" is 216, and "lo" is 219. Hence, the substring with lowest score is "he".
//Example 2:
//Input:
//str = "geeksforgeeks"
//k = 5
//Output:
//eeksf
//Explanation: The substrings of length k = 5, are "geeks" with score 527, "eeksf
//with score 526, "eksfo" with score 536, "ksfor" with score 549, "sforg" with score 545, "forge" with score 531, "orgee" with score 530, "rgeek" with score 526, and "geeks" with score 527. There are two substrings with the lowest score 526, but since starting index of "eeksf" is smallest, hence, "eeksf" is the answer.
public class Smallest_Substring {
    public static void main(String[] args) {
        System.out.println(smallestSubstring("geeksforgeeks",5));
        System.out.println(smallestSubstring("hello",2));
    }
    public static String smallestSubstring(String str, int k) {
        if(str == null || str.length()<k || k<=0) return "";
        int sum = 0, minSum = 0;
        for(int i=0;i<k;i++){
            sum += str.charAt(i);
        }
        minSum = sum;
        int startIndex = 0;
        for(int i=k;i<str.length();i++){
            sum = sum - str.charAt(i-k) + str.charAt(i);
            if(sum<minSum){
                minSum = sum;
                startIndex = i - k + 1;
            }
        }
        return str.substring(startIndex, startIndex + k);
    }
}

