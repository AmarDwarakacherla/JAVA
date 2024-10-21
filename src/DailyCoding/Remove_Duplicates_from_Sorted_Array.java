package DailyCoding;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

    }
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index++] = nums[i];
            }
        }
        for(int i=0;i<index;i++) System.out.print(nums[i]+" ");
        System.out.println();
        return index;
    }
}
