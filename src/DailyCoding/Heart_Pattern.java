package DailyCoding;

public class Heart_Pattern {
    public static void main(String[] args) {
        int i, j;
        int n = 6;

        // Top part of the heart
        for (i = n / 2; i <= n; i += 2) {
            for (j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part of the hear
        for (i = n; i >= 1; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
