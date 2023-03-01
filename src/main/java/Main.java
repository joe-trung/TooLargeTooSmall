import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        guessingGame();
    }

    public static void guessingGame() {
        Scanner in = new Scanner(System.in);
        int mysteryNumber = (int)(Math.random()*10);
        System.out.print("How many time you want to guess?");
        int n = in.nextInt();
        if (n > 0)  {
            int i;
            for (i = 1; i <= n; i++) {
                System.out.print("Please Guess a number 1 to 10:");
                int guessNumber = in.nextInt();
                if (guessNumber < mysteryNumber) {
                    System.out.print("Your number is smaller. \n");
                } else if (guessNumber > mysteryNumber) {
                    System.out.print("Your number is bigger. \n");
                } else {
                    System.out.print("Hooray! You are a master.\n");
                    break;
                }
            }
            if (i == n+1) {
                System.out.print("You've reached your max guessing time. Good luck next time");
            }

        }
    }
}