package DailyCoding.LeetCode;

import java.util.Arrays;

public class _1358_Number_of_Substrings_Containing_All_Three_Characters {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(numberOfSubstrings("abcabc"));
        long end = System.nanoTime();
        System.out.println((end - start)/1_000_000.0);
    }
    static public int numberOfSubstrings(String s) {
//        int count = 0;
//        int[] arr = new int[3];
//
//        for(int i=0;i<s.length();i++){
//            Arrays.fill(arr,0);
//            for(int j=i;j<s.length();j++){
//
//                arr[s.charAt(j)-'a']++;
//                if (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
//                    count += (s.length() - j);
//                    break;
//                }
//            }
//        }
//        return count;


        int[] count = new int[3];
        int left = 0, res = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += s.length() - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return res;
    }
    
}
