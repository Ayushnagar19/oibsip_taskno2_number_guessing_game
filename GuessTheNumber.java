import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 5;
        int rounds = 1;
        int score = 0;

        System.out.println("Welcome to Guess the Number Game!");
        while (attempts < maxAttempts) {
            System.out.println("Round " + rounds + "\nGuess the number (between 1 and 100):");
            int guess = Integer.parseInt(System.console().readLine());

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + (attempts + 1) + " attempts.");
                score += (maxAttempts - attempts) * 10;
                attempts = maxAttempts;
            } else if (guess < secretNumber) {
                System.out.println("Try again! The number is higher than " + guess + ".");
            } else {
                System.out.println("Try again! The number is lower than " + guess + ".");
            }
            attempts++;
        }

        System.out.println("Game over! Your score: " + score);
    }
}