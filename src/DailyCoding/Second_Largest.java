package DailyCoding;

public class Second_Largest {
    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{1,2,4,10,5}));
    }
    static int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }
        if(second<=0)   return -1;
        return second;
    }
}
