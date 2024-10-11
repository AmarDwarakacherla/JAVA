package TCS_PRACTICE.Programs;

import java.util.LinkedHashSet;
import java.util.Set;

//input : experience
//output : exprinc
//remove the duplicate elements
public class EX_3 {
    public static void main(String[] args) {
        String str = "experience";
        String res = "";
        for(int i=0;i<str.length();i++){
            if(res.indexOf(str.charAt(i)) ==-1){
                res += str.charAt(i);
            }
        }
        System.out.println(res);
        Set<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        String result = "";
        for(char ch : set){
            result += ch;
        }
        System.out.println(result);

    }
}
