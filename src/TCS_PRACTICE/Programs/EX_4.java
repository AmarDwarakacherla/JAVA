package TCS_PRACTICE.Programs;



//input : Hi I am Student;
//output : 4 13
//you need to find how many spaces and characters in a sentence
public class EX_4 {
    public static void main(String[] args) {
        String str = "Hi I am a Student";
        int space=0, characters=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                space++;
            }
            else if(Character.isAlphabetic(str.charAt(i))){
                characters++;
            }
        }
        System.out.println(space + " " + characters);

        String[] words = str.split(" ");
        System.out.println(words.length-1 + " " + (str.length()- (words.length-1)));
    }
}
