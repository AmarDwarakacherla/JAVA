package Bot;

public class Maximum_and_minimum_of_an_array {
    public static void main(String[] args) {
        int arr[] = minmax(new int[]{1,5,10,2,7});
        System.out.println("Max: "+ arr[1]);
        System.out.println("Min: "+ arr[0]);

    }
    static int[] minmax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return new int[]{max,min};
    }
}
