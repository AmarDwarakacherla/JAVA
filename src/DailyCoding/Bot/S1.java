package DailyCoding.Bot;

import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
public class S1{
    public static void main(String[] args) {
        Student[] s1 = new Student[4];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int id = input.nextInt();input.nextLine();
            String name = input.nextLine();
            int marks = input.nextInt();
            s1[i] = new Student(id, name, marks);
        }
        Student s = findHeighestMark(s1);
        System.out.println(s.getId() +" "+s.getName()+" "+s.getMarks());
    }
    public static Student findHeighestMark(Student[] s1){
        int heightest = Integer.MIN_VALUE;
        Student maxStu = null;
        for(int i=0;i<s1.length;i++){
            if(s1[i].getMarks()>heightest){
                heightest = s1[i].getMarks();
                maxStu = s1[i];
            }
        }
        return maxStu;

    }
}
