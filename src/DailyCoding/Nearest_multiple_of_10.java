package DailyCoding;

public class Nearest_multiple_of_10 {
    public static void main(String[] args) {
        System.out.println(roundToNearest("15"));

    }
    public static String roundToNearest(String str) {
        int x = Integer.valueOf(str);
        int i = x;
        int j = x;
        while(i>=1 && j>=1){
            i--;j++;
            if(i%10 ==0)
                return String.valueOf(i).toString();
            else if(j%10 ==0)
                return String.valueOf(j).toString();
        }
        return str;
    }
}
