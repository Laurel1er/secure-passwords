import java.util.HashSet;
import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        
        HashSet<String> sequence = new HashSet<String>();
        sequence.add("1234");
        sequence.add("azerty");
        sequence.add("qwerty");
        String regexRepeated = "[a-zA-Z0-9]{3,}";
        Scanner inScanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        
        String password = inScanner.nextLine();

        if (password.matches(regexRepeated) || password.length() < 8 || password.length() > 32 || sequence.contains(password)) {
            System.out.println("Password too esay to guess!");
        }

        System.out.println("You entered: " + password);

    }
}