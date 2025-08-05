package DailyCoding.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _118_Pascal_s_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==0)
            return res;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> prev = res.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++)
            {
                row.add(prev.get(j)+prev.get(j+1));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));

    }
}
