package DailyCoding;

import java.util.Scanner;

public class Amar_ClassName_Crete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        StringBuilder sb = new StringBuilder();
        if(str.charAt(0)>='0' && str.charAt(0)<='9')sb.append("_");
        int i = 0;
        for(i=0;i<str.length();i++){
            if(Character.isWhitespace(str.charAt(i))){
                sb.append("_");
            }
            if(str.charAt(i)=='-'){
                sb.append("_");
            }
            else if(str.charAt(i)=='.' && Character.isWhitespace(str.charAt(i+1))){
                sb.append("");
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}

