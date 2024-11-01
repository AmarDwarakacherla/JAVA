package TCS_PRACTICE.G_Meet;
import java.util.*;
class Student{
    private int id;
    private String name;
    private int marksObtrained;
    public Student(int id, String name, int marksObtrained) {
        this.id = id;
        this.name = name;
        this.marksObtrained = marksObtrained;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMarksObtrained() {
        return marksObtrained;
    }
    public int getPercentage(){
        return (int)((this.marksObtrained/400.0)*100);
    }
}
// Sample Input 1
//5
//104
//Uma
//223
//102
//Cissy
//283
//105
//Eva
//295
//101
//Jenny
//372
//100
//jisha
//372
//Sample Output 1
//JISHA
//100
//102
// 105
public class Solution_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Student[] st = new Student[n];
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(input.nextLine());
            String b = input.nextLine();
            int c = Integer.parseInt(input.nextLine());
            st[i] = new Student(a, b, c);
        }
        String[] names = findStudentWithhighest(st);
        if(names.length>0){
            for(int i=0;i<names.length;i++){
                System.out.println(names[i]);
            }
        }else{
            System.out.println("Not Found");
        }
        int[] ids = searchStudentsBypercentage(st);
        if(ids.length>0){
            for(int i=0;i< ids.length;i++){
                System.out.println(ids[i]);
            }
        }else{
            System.out.println("No id's Found");
        }
    }
    static String[] findStudentWithhighest(Student[] st){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<st.length;i++){
            if(st[i].getMarksObtrained()>max){
                max = st[i].getMarksObtrained();
            }
        }
        ArrayList<String> names = new ArrayList<>();
        for(int i=0;i<st.length;i++){
            if(st[i].getMarksObtrained()==max){
                names.add(st[i].getName().toUpperCase());
            }
        }
        return names.toArray(new String[0]);
    }
    static int[] searchStudentsBypercentage(Student[] st){
        int count = 0; // for the purpose to know the how many id's are there and to store int array length
        for(int i=0;i<st.length;i++){
            if(st[i].getPercentage()>70){
                count++;
            }
        }
        int[] ids = new int[count];
        int index = 0;
        for(int i=0;i<st.length;i++){
            if(st[i].getPercentage()>70){
                ids[index++] = st[i].getId();
            }
        }
        //sorting
        if(ids.length>1){
            for(int i=0;i<ids.length-1;i++){
                for(int j=i+1;j< ids.length;j++){
                    if(ids[i]>ids[j]){
                        int temp = ids[i];
                        ids[i] = ids[j];
                        ids[j] = temp;
                    }
                }
            }
        }
        return ids;


    }
}
