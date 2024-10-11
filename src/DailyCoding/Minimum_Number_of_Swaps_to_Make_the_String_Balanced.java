package DailyCoding;

import java.util.Stack;

public class Minimum_Number_of_Swaps_to_Make_the_String_Balanced {
    public static void main(String... args){
        String str = "]]][[[";
        System.out.println(minSwaps(str));

    }
    public static int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty() || stack.peek() == ']'){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }
        System.out.println("Stack content after processing: " + stack);
        int closed = stack.size()/2;
        return (closed+1)/2;



//        int imBalance = 0;
//        int maxBalance = 0;
//        for(char ch : s.toCharArray()){
//            if(ch == '['){
//                imBalance--;
//            }else{
//                imBalance++;
//            }
//            maxBalance = Math.max(maxBalance, imBalance);
//        }
//        return (maxBalance+1)/2;
    }
}
