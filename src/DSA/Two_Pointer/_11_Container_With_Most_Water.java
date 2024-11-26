package DSA.Two_Pointer;
public class _11_Container_With_Most_Water {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    static public int maxArea(int[] height) {
        int maxArea = 0, currArea = 0, width = 0, left = 0, right = height.length-1;
        while(left<right){
            width = right - left;//FINDING THE WIDTH
            currArea = width * (Math.min(height[left], height[right])); //FINDING THE HEIGHT WHICH IS MINIMUM
            maxArea = Math.max(maxArea, currArea);
            if(height[left]<height[right]) left++; // CHECKING WITH RIGHT AND LEFT
            else right--;
        }
        return maxArea;
    }
}
