import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        boolean includeUppercase = getUserChoice(scanner, "Include uppercase letters? (yes/no): ");
        boolean includeLowercase = getUserChoice(scanner, "Include lowercase letters? (yes/no): ");
        boolean includeNumbers = getUserChoice(scanner, "Include numbers? (yes/no): ");
        boolean includeSpecialChars = getUserChoice(scanner, "Include special characters? (yes/no): ");
        String password = generatePassword(length, includeUppercase, includeLowercase, includeNumbers, includeSpecialChars, random);
        System.out.println("Generated Password: " + password);
    }10

    private static boolean getUserChoice(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    private static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSpecialChars, Random random) {
        StringBuilder password = new StringBuilder();
        StringBuilder characterPool = new StringBuilder();
        if (includeUppercase) characterPool.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        if (includeLowercase) characterPool.append("abcdefghijklmnopqrstuvwxyz");
        if (includeNumbers) characterPool.append("0123456789");
        if (includeSpecialChars) characterPool.append("!@#$%^&*()-_=+[]{}|;:,.<>?/");

        if (characterPool.length() == 0) throw new IllegalArgumentException("At least one character type must be selected.");

        for (int i = 0; i < length; i++) {
            password.append(characterPool.charAt(random.nextInt(characterPool.length())));
        }

        return password.toString();
    }
}