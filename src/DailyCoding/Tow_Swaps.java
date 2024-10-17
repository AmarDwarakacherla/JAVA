package DailyCoding;
import java.util.*;
public class Tow_Swaps {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,3,2,1));
        boolean check = checkSorted(arr);
        System.out.println(check);

    }
    public static boolean checkSorted(List<Integer> arr) {
        List<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        int first = -1, second = -1, third = -1, fourth = -1;
        int misMatch = 0;

        for(int i=0;i<arr.size();i++){
            if (!arr.get(i).equals(sorted.get(i))) {
                misMatch++;
                if(misMatch == 1){
                    first = i;
                }
                else if(misMatch ==2){
                    second = i;
                }
                else if(misMatch == 3){
                    third = i;
                }
                else if(misMatch == 4){
                    fourth = i;
                }
            }
        }
        if(misMatch == 2){
            swap(arr, first, second);
            return arr.equals(sorted);
        }
        if(misMatch == 4){
            swap(arr,first,second);
            swap(arr,third,fourth);
            System.out.println(arr);
            boolean sort1 = arr.equals(sorted);
            swap(arr,first,second);
            swap(arr,third,fourth);

            swap(arr,first,third);
            swap(arr,second,fourth);
            System.out.println(arr);
            boolean sort2 = arr.equals(sorted);
            swap(arr,first,third);
            swap(arr,second,fourth);

            swap(arr,first,fourth);
            swap(arr,second,third);
            System.out.println(arr);
            boolean sort3 = arr.equals(sorted);

            return sort1 || sort2 || sort3;

        }
        return false;
    }
    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

}
