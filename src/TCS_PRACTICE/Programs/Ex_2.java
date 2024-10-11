package TCS_PRACTICE.Programs;



//input : DataBase
//output: 6
//need to cout all the small letters
public class Ex_2 {
    public static void main(String[] args) {
        String str = "DataBase";
        int count = 0;
        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        System.out.print(count);
    }
}
