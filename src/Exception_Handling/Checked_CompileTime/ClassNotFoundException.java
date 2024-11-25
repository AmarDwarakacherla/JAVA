package Exception_Handling.Checked_CompileTime;

public class ClassNotFoundException {
    public static void main(String[] args) throws java.lang.ClassNotFoundException {
        method1();
    }
    static void method1() throws java.lang.ClassNotFoundException {
        throw new java.lang.ClassNotFoundException();
    }
}
