package DailyCoding;

public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        System.out.println(maxProductApproach2(new int[]{-2, 6, -3, -10, 0, 2}));

        for(int i=0;i<=5;i++){
            System.out.println("*".repeat(i));
        }
    }
    static int maxProductApproach1(int[] arr) {
        int maxPro = Integer.MIN_VALUE,pro = 1;
        for(int i=0;i<arr.length;i++){
            pro = 1;
            for(int j=i;j<arr.length;j++){
                pro *= arr[j];
                maxPro = Math.max(maxPro,pro);
            }
        }
        return maxPro;
    }
    static int maxProductApproach2(int[] arr){
        int n=arr.length, left=1, right=1, pro = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            left = left==0 ? 1 : left;
            right = right==0 ? 1 : right;
            left *= arr[i];
            right *= arr[n-1-i];
            pro = Math.max(pro, Math.max(left, right));
        }
        return pro;
    }
}
