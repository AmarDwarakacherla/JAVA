package STREAMS;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Amar", "Harsha", "Pavan"));
        names.stream()
                .filter(n -> {System.out.println("Filtering "+n); return n.startsWith("A");})
                .forEach(System.out::println);
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4));
        int pro = nums.stream().reduce(1,(a,b)->a*b);
        System.out.println(pro);


    }

}
