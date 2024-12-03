package DailyCoding;

public class _2109_Adding_Spaces_to_a_String {
    public static void main(String[] args) {
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[]{8,13,15}));

    }
    static public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int t = 0;
        for(int i=0;i<s.length();i++){
            if (t < spaces.length && i == spaces[t]) {
                sb.append(" ");t++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
