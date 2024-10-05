package TCS_PRACTICE;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int lower = 0;

        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                lower++;
            }
        }
        if(lower>0)
        {
            System.out.print(lower);
        }
    }
}
