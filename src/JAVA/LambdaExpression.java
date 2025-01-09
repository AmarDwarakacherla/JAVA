package JAVA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,20,10,5,4,2,1);
        Collections.sort(list, (a,b) -> a.compareTo(b));

        List<Integer> even = (list) -> list%2;
    }
}
