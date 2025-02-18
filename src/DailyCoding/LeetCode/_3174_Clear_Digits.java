package DailyCoding.LeetCode;

import java.util.Stack;

public class _3174_Clear_Digits {
    public static void main(String[] args) {
        System.out.println(clearDigits("cb"));
    }
    static public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch) && !stack.isEmpty() && Character.isLetter(stack.peek())) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }

}
