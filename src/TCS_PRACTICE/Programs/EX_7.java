package TCS_PRACTICE.Programs;
//Take an integer as input and return true if the sum of the digits is divisible by 3 else return false
//input: 123
//output: true

//input: 1234
//output: false
import java.util.Scanner;


public class EX_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        while(n>0){
            sum += n%10;
            n=n/10;
        }
        System.out.println((sum % 3 == 0) ? "true" : "false");
    }

}
