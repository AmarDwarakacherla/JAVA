package TCS_PRACTICE.Programs;


//Find the largest word from a given sentence
//if two Strings have same length then print the first one
//input: TCs is the best Company Ever
//output: Company
public class EX_8 {
    public static void main(String[] args) {
        String str = "TCs is the best Company Ever".trim();
        String[] words = str.split("\\s+");
        int maxLen = Integer.MIN_VALUE;
        String word = "";
        for(String i : words){
            if(maxLen < i.length()){
                maxLen = i.length();
                word = i;
            }
        }
        System.out.print(word);
    }
}
