package DSA.Two_Pointer;
public class _26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public static int removeDuplicates(int[] nums) {
        int slow = 1;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[fast-1]!=nums[fast]){
                nums[slow++]=nums[fast];
            }
        }
        return slow;
    }
}
