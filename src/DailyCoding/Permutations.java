package DailyCoding;


public class Permutations {
    public static void swap(char[] ch, int i, int j){
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
    }
    public static void permutate(char[] str, int l, int r){
        if(l == r){
            System.out.println(String.valueOf(str));
            return;
        }
        for(int i=l;i<=r;i++){
            swap(str, l, i); //fix one character
            permutate(str, l+1, r); //change the rest
            swap(str, l ,i); //backtrack
        }

    }
    public static void main(String[] args) {
        String s = "ABC";
        char[] charArray = s.toCharArray();
        permutate(charArray, 0, charArray.length - 1);

    }
}
