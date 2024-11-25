package Exception_Handling.Checked_CompileTime;

public class Exception_1 {
    public static void main(String[] args) {
        method1();
    }
    static void method1(){
        throw new ArithmeticException();
    }
}
