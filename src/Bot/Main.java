package Bot;

import java.util.Arrays;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        Student stu = new Student(123,"Amar","amar","CSE");
//        System.out.println(stu.getBranch());
        System.out.println(stu.toString());

        Student[] s = new Student[5];
        s[0] = new Student(123,"Amar","amar","CSE");
        s[1] = new Student(123,"Bot","Bot","None");
        s[2] = new Student(123,"Amar","amar","CSE");
        s[3] = new Student(123,"Bot","Bot","None");
        s[4] = new Student(123,"Bot","Bot","None");

        s[2].setName("SahBot");



       for(int i=0;i<s.length;i++){
           System.out.println(s[i].toString());
       }
    }
}


class Student {
    private int id;
    private String name;
    private String email;
    private String branch;
    public Student(int id, String name, String email, String branch) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.branch = branch;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getBranch() {
        return branch;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
