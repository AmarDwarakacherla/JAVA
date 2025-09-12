package DailyCoding.LeetCode;

public class _3227_Vowels_Game_in_a_String {
    public static void main(String[] args) {
        System.out.println(doesAliceWin("leetcoder"));
    }
    public static boolean doesAliceWin(String s) {
        for (char c : s.toCharArray()) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                return true;
        }
        return false;
    }

}
