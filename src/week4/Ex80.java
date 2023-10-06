package week4;
import java.util.Random;
public class Ex80 {
    private int length;
    private Random random;

    public Ex80(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            // Generate a random number between 0 and 25 (inclusive)
            int randomNumber = random.nextInt(26);

            // Convert the random number to a character between 'a' and 'z'
            char randomChar = (char) ('a' + randomNumber);

            // Append the character to the password
            password.append(randomChar);
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Ex80 randomizer = new Ex80(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
