package DailyCoding;

public class Fnd_nTh_Element_of_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},
                {5,6,7,8},
                {7,9,2,1}};
        System.out.println(findKthElement(arr,8));
    }


    public static int findKthElement(int[][] matrix, int k) {
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        int index = 0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right && index<k ;i++){
                index++;
                if(index == k){
                    return matrix[top][i];
                }
            }
            top++;

            for(int i=top;i<=bottom && index<k;i++){
                index++;
                if(index == k){
                    return matrix[i][right];
                }
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left && index<k;i--){
                    index++;
                    if(index == k){
                        return matrix[bottom][i];
                    }
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top && index<k;i--){
                    index++;
                    if(index == k){
                        return matrix[i][left];
                    }
                }
                left++;
            }


        }
        return -1;
    }
}
