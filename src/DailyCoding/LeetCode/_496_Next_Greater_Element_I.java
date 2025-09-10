package DailyCoding.LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class _496_Next_Greater_Element_I {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : nums2){
            if(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int[] res = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }


    public int[] nextGreaterElementTest(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        for(int i=nums2.length-1;i>=0;i--){
            num = nums2[i];
            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
            map.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }
        int[] res = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
