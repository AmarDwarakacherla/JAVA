package Interview;

public class APPLICATION {
    static class A{
        static int value = 1 + B.value;
    }
    static class B{
        static int value = 1 + C.value;
    }
    static class C{
        static int value = 1 + A.value;
    }

    public static void main(String[] args) {
        new C();
        System.out.println(A.value);
        System.out.println(B.value);
        System.out.println(C.value);
    }
}
