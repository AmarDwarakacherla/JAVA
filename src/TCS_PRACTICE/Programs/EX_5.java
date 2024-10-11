package TCS_PRACTICE.Programs;
import java.util.*;
//Write a program to print the last character of every word in a String
//Ignore the digits and whiteSpaces
//input : Hey3 Java Learners
//output : as
public class EX_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            char ch = words[i].charAt(words[i].length()-1);
            if(Character.isDigit(ch)){
                continue;
            }
            else{
                System.out.print(ch+" ");
            }
        }



    }
}
