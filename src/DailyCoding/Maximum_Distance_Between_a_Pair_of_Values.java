package DailyCoding;

public class Maximum_Distance_Between_a_Pair_of_Values {
    public static void main(String[] args) {
        int[] arr1 = new int[]{55,30,5,4,2};
        int[] arr2 = new int[]{100,20,10,10,5};
        System.out.println(maxDistance(arr1,arr2));

    }
    public static int maxDistance(int[] nums1, int[] nums2) {
        int i=0, j=0;
        int maxDis = 0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j]){
                i++;
            }
            else{
                maxDis = Math.max(maxDis, j-i);
                j++;
            }
        }
        return maxDis;


//        Without using Two Pointer Approach
//        int maxDist = 0;
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = i; j < nums2.length; j++) {
//                if (nums1[i] <= nums2[j]) {
//                    maxDist = Math.max(maxDist, j - i);
//                }
//            }
//        }

    }
}
