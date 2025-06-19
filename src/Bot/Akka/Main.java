package Bot.Akka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student stu = new Student(1,"Amar",25);
        Student stu1 = new Student();
        System.out.println(stu);
        // 5 students data;
//        int arr[] = new int[]{1,2,3,4,5};
//        int t[] = new int[5];
        Employee emp[] = new Employee[]{
                new Employee(1,"Amar","25"),
                new Employee(12,"Harhsa","25"),
                new Employee(14,"Pavan","25")
        };
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(arr);
        
        List<Employee> employee = new ArrayList<>(List.of(
                new Employee(1,"Amar","25"),
                new Employee(12,"Harhsa","25"),
                new Employee(14,"Pavan","25")
        ));

      for(Employee emp1: employee){
          System.out.println(emp1);
      }
      String[] s = new String[]{"Amar","Pavan","Harsha"};

      int x = Arrays.stream(s).map(n->n.length()).reduce(0,(y,n)->y+n);
        System.out.println(x);



    }
}
