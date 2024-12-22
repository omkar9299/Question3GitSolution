
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random rand = new Random();

        // Loop to generate and print five 4-digit random numbers
        for (int i = 0; i < 5; i++) {
            // Generate a random 4-digit number between 1000 and 9999
            int randomNumber = 1000 + rand.nextInt(9000); // 9000 is the range, plus 1000 ensures 4 digits
            System.out.println(randomNumber);
        }
    }
}
