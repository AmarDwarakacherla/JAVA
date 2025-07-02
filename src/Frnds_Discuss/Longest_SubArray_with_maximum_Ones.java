package Frnds_Discuss;

public class Longest_SubArray_with_maximum_Ones {
    public static void main(String[] args) {
        System.out.println(findMaxOnesApprach3(new int[]{1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,1,1,1}));
    }
    public static int findMaxOnesApprach1(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i;j<arr.length-1;j++){
                if(arr[j]==arr[j+1]){
                    count++;
                }else{
                  break;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }


    public static int findMaxOnesApprach2(int[] arr) {
        if (arr.length == 0) return 0;
        int max = 1, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }
        return max;
    }

    public static int findMaxOnesApprach3(int[] arr){
        int max = 1;
        int start = 0;
        for (int end = 1; end < arr.length; end++) {
            if (arr[end] != arr[start]) {
                max = Math.max(max, end - start);
                start = end;
            }
        }
        max = Math.max(max,arr.length-start);
        return max;
    }
}
