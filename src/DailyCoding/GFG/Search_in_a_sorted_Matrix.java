package DailyCoding.GFG;

public class Search_in_a_sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};

    }

    public boolean searchMatrix1(int[][] mat, int x) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) return true;
            }
        }
        return false;
    }

    public boolean searchMatrix2(int[][] mat, int x) {
        return false;
    }
}
