package DailyCoding;

public class a {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n-1;i>=0;i--){
            int t = i;
            for(int j=0;j<n-i;j++){
                char ch = (char)('A' + t);
                t++;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
