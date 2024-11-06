import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        
        String regexSequence = "";
        String regexRepeated = "[a-zA-Z0-9]{3,}";
        Scanner inScanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        
        String password = inScanner.nextLine();

        if (password.matches(regexSequence)) {
            System.out.println("Password too esay to guess!");
        }

        System.out.println("You entered: " + password);

    }
}