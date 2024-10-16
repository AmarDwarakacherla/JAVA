package DailyCoding;

public class Finding_The_Second_Heighest_Prime_Number {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 11, 7, 4, 15, 19, 23, 10, 11};
        System.out.println(findSecondHeighestPrime(arr));
    }
    public static int findSecondHeighestPrime(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                if(arr[i]>first){
                    second = first;
                    first = arr[i];
                }
                else if(arr[i]>second && first!=arr[i]){
                    second = arr[i];
                }
            }
        }
        return second;
    }
    public static boolean isPrime(int n){
        if(n<=0)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
