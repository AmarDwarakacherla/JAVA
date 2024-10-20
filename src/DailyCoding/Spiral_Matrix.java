package DailyCoding;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int n = 4, m =4;
        List<Integer> res = spiralPathMatrix(arr,n,m);
        System.out.println(res);
    }
    public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        List<Integer> spiral = new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                spiral.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                spiral.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiral;
    }
}
