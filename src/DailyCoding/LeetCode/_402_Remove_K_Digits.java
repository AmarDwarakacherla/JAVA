package DailyCoding.LeetCode;

import java.util.Stack;

public class _402_Remove_K_Digits {
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        //check weather the peak element is big or not
        for(char ch : num.toCharArray()){
           while(!stack.isEmpty() && k>0 && stack.peek()>ch){
               stack.pop();
               k--;
           }
           stack.push(ch);
        }
        //If not found any element the remove the last element from the stack until k
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: stack){
            sb.append(ch);
        }
        //Removing the leading zeros
        while(sb.length()>0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0 ? "0" : sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
        System.out.println(removeKdigits("10200", 1));
        System.out.println(removeKdigits("10", 2));

    }
}
