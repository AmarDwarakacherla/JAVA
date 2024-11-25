package DSA.Two_Pointer;

public class _27_Remove_Element {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }
    static public int removeElement(int[] nums, int val) {
        int start = 0;
        for(int i : nums){
            if(i != val){
                nums[start++] = i;
            }
        }
        return start;
    }
}
