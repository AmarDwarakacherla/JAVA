package JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class functionalInterface {
    public static void main(String[] args) {
        Interface obj = new Interface() {
            @Override
            public void execute() {
                System.out.println("Function interface Working....!");
            }
        };
        obj.execute();

        Interface object = () -> System.out.println("Function interface Working....!");
        object.execute();


        List<String> list = Arrays.asList("Harsha", "Pavan", "Amar", "Eswar");
        Predicate<String> checkLen4 = (name) -> name.length()>4;
        for(String s : list){
            if(checkLen4.test(s)){
                System.out.println(s);
            }
        }
    }
}

interface Interface{
    void execute();
}

@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}
