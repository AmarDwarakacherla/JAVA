package com.Amar;
import java.util.regex.*;

public class REGEX {
    public static void main(String[] args)
    {
        String str = "Amar";
        System.out.print(Pattern.matches(".mar",str));
        Pattern pattern = Pattern.compile("bc");
        Matcher matcher = pattern.matcher("abc");
        System.out.print(matcher.matches()); // true or false
//        System.out.print(pattern.find(5));



    }
}
