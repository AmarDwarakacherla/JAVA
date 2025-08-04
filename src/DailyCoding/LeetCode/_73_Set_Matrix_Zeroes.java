package DailyCoding.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _73_Set_Matrix_Zeroes {
    public static void setZeroesApproach1(int[][] matrix) {
        Set<Integer> row = new HashSet<>(), col = new HashSet<>();
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void setZeroesApproach2(int[][] matrix) {
        boolean firstrow=false, firstcol=false;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(i==0)
                        firstrow=true;
                    if(j==0)
                        firstcol=true;

                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }

            }
        }
        if(firstrow)
            for(int i=0;i<matrix[0].length;i++)
                matrix[0][i]=0;
        if(firstcol)
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        setZeroesApproach2(arr);
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
        Arrays.stream(arr)
                .forEach(row -> {
                    Arrays.stream(row)
                            .forEach(val -> System.out.print(val));
                    System.out.println();
                });


    }
}
