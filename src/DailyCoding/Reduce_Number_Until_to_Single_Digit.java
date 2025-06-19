package DailyCoding;

public class Reduce_Number_Until_to_Single_Digit {
    public static void main(String[] args) {
        System.out.println(Approach3(12345));
    }
    public static int Approach2(int n){
        int sum = 0 ;
        while(n>9){
            sum=0;
            while(n>0){
                sum += n%10;
                n=n/10;
            }
            n = sum;
        }
        return n;
    }
    public static int Apprach2(int n){
        int sum = 0;
        while(n>9){
            n = findSum(n);
        }
        return n;

    }
    private static int findSum(int n) {
        int sum = 0;
        while(n>0){
            sum += n%10;
            n=n/10;
        }
        n = sum;
        return n;
    }
    public static int Approach3(int n) {
        if (n <= 9) return n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return Approach3(sum);
    }
}
