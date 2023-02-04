import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*_=+-/.?<>)";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Number of letters: ");
        int numLetters = sc.nextInt();
        System.out.print("Number of digits: ");
        int numNumbers = sc.nextInt();
        System.out.print("Number of special symbols: ");
        int numSpecials = sc.nextInt();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < numLetters; i++) {
            int randomIndex = r.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }
        for (int i = 0; i < numNumbers; i++) {
            int randomIndex = r.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }
        for (int i = 0; i < numSpecials; i++) {
            int randomIndex = r.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }

        StringBuilder mixedPassword = new StringBuilder();
        while (password.length() > 0) {
            int randomIndex = r.nextInt(password.length());
            mixedPassword.append(password.charAt(randomIndex));
            password.deleteCharAt(randomIndex);
        }

        System.out.println("Password : " + mixedPassword.toString());
        sc.close();
    }
}
