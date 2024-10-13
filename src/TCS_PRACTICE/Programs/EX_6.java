package TCS_PRACTICE.Programs;
//Find the Characters of a String at odd Index
//input : Management
//output : aaeet
public class EX_6 {
    public static void main(String[] args) {
        String str = new String("Management");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }
}
