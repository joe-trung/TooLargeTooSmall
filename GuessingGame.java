public class Main {
    public static void main(String arg[]){
        guessingGame();
    }
    public static void guessingGame(){
       Scanner in = new Scanner(System.in);
       int mysteryNumber = Math.random(1,100);
       System.out.println("How many time you want to guess?");
       n = in.nextInt();
       if (n>0) continue;
       else
           for (i=1; i < n; i++) {
               System.out.println("Please Guess a number:");
               guessNumber = in.nextInt();
               if (guessNumber < mysteryNumber) {
                   System.out.println("Your number is smaller.");
               }
               else if (guessNumber > mysteryNumber) {
                   System.out.println("Your number is bigger.");
               }
               else {
                   System.out.println("Hooray! You are a master.");
               }
           }
           if (i == n) {
               System.out.println("You've reached your max guessing time.");
           }

    }

}
