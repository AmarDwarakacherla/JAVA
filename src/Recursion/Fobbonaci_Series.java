package Recursion;

public class Fobbonaci_Series {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    static int fib(int n){
       if(n<2) return n;
       return fib(n-1) + fib(n-2);

    }
}
