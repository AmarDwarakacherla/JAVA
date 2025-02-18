package DSA.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class lambda {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//        System.out.println(Arrays.toString(Arrays.stream(arr).map(n -> n*n).toArray()));
//        System.out.println(list.stream().map(n->n*n).collect(Collectors.toList()));

        String name = "Amar";
        name.chars().forEach(c -> System.out.print((char)c));
        System.out.println();
        name =  name.chars()
                .mapToObj(c ->(char) c)
                .map(Character::toUpperCase)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(name);
    }
    public int[] findEven(int[] arr){
//        ArrayList<Integer> even = new ArrayList<>();
//        Predicate<Integer> isEven = num -> num%2 == 0;
//        for(int i: arr){
//            if(isEven.test(i)){
//                even.add(i);
//            }
//        }
//        return even.stream().mapToInt(Integer::intValue).toArray();

        return Arrays.stream(arr)
                .filter(n -> n%2 == 0)
                .toArray();
    }
}
