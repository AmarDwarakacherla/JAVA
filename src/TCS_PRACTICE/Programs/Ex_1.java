package TCS_PRACTICE.Programs;


//String Input: XpLorle
//Character Input : r
//Output : 4
public class Ex_1 {
    public static void main(String[] args) {
        String str = "Xplore";
        char ch = 'r'; // input.next().charAt(0);
        System.out.println(str.indexOf(ch));

        int index = 0;
        for(char c : str.toCharArray()){
            if(c ==ch){
                break;
            }
            index++;
        }
        System.out.print(index);
    }
}
