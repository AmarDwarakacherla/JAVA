package Exception_Handling.Uncehecked_Runtime;

import java.util.Arrays;

public class IndexOutOfBoundException {
    public static void main(String[] args) {
        int[] val = new int[2];
//        Arrays.fill(val,-1);
//        System.out.println(val[0]);
        val[3] = 10;
    }
}
