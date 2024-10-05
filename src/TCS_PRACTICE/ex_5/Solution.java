package TCS_PRACTICE.ex_5;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        Student[] st = new Student[n];
        for(int i=0;i<n;i++)
        {
            int id = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
            int marks =input.nextInt();input.nextLine();
            int age = input.nextInt();
            input.nextLine();
            st[i] = new Student(id, name, marks, age);
        }
//        System.out.println(Arrays.toString(st));
        int searchId = input.nextInt();
        input.nextLine();
        Student maxAge = findStudentWithMaximumAge(st);
        System.out.println(maxAge);
        Student searchById = searchStudentById(st,searchId);
        System.out.println(searchById);


    }
    public static Student findStudentWithMaximumAge(Student[] st)
    {
        if(st==null || st.length<=0)
            return null;
        Student maxAge = st[0];
        for(Student student: st)
        {
            if(student.getAge()> maxAge.getAge())
            {
                maxAge = student;
            }
        }
        return maxAge;
    }
    public static Student searchStudentById(Student[] st,int value)
    {
        if(st==null || st.length<=0)
            return null;
        for(Student student : st)
        {
            if(student.getId() == value)
            {
                return student;
            }
        }
        return null;

    }
}
class Student{
    private int id;
    private String name;
    private int marks,age;
    Student(int id, String name, int marks, int age)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
