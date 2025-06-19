package DailyCoding.LeetCode;

public class _1903_Largest_Odd_Number_in_String {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("4206"));
    }
    static public String largestOddNumber(String num) {
        int max = Integer.MIN_VALUE;
        String str = "";
        int val = 0;
        char[] charArr = num.toCharArray();
       for(int i=0;i<charArr.length;i++){
           str = "";
           for(int j=i;j<charArr.length;j++){
               str = str + String.valueOf(charArr[j]);
               val = Integer.parseInt(str);
               if (val % 2 == 1) {  // Check if odd
                   max = Math.max(val, max);
               }
           }
       }
        return max > 0 ? String.valueOf(max): "";
    }

    static public String Approach2(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
