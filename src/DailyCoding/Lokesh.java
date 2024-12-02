package DailyCoding;
import java.util.*;
public class Lokesh {
    public static void main(String[] args) {
        System.out.println(countDistinctCategories(new int[]{1, 2, 1}));
        System.out.println(countDistinctCategoriesApprach2(new int[]{1, 2, 1}));
    }
    static public int countDistinctCategories(int[] categories) {
        Map<Integer, Integer> count = new HashMap<>();
        int sum = 0, dist = 0;
        for (int i = 0; i < categories.length; i++) {
            count.clear();
            dist = 0;
            for (int j = i; j < categories.length; j++) {
                if (!count.containsKey((categories[j]))) {
                    dist++;
                }
                count.put(categories[j], count.getOrDefault(categories[j], 0) + 1);
                sum += dist;
            }
        }
        return sum;
    }
    static public int countDistinctCategoriesApprach2(int[] nums) {
        int sum = 0, start = 0;
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            while(count.get(nums[start])>1){
                count.put(nums[start],count.get(nums[start])-1);
                if(count.get(nums[start])==0)
                    count.remove(nums[start]);
                start++;
            }
        for(int t=start;t<=i;t++)
            sum+=count.size();
        }
        return sum;
    }
}

