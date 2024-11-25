package Exception_Handling.Uncehecked_Runtime;

public class NullPointerException {
    public static void main(String[] args) {
        String val = null;
        System.out.println(val.charAt(0));
    }
}
