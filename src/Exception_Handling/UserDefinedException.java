package Exception_Handling;


class userException extends Exception{
    public userException(String message){
        super(message);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        try {
            throw new userException("This is a user-defined exception!");
        } catch (userException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
