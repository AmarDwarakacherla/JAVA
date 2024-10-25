package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap_Adjacent_Bit_Pairs {
    public static void main(String[] args) {
        System.out.println(swapAdjacent(10));
    }
    public static int swapAdjacent(int n)
    {
        String bin = Integer.toBinaryString(n);
        char[] ch = bin.toCharArray();
        char t = 'a';
        for(int i=0;i<ch.length-1;i+=2){
            t = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = t;
        }
        bin = "";
        for(char c : ch) bin += c;
        n = Integer.parseInt(bin,2);
        return n;
    }
}
