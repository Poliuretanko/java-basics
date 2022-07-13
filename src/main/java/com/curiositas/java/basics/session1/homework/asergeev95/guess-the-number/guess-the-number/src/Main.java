import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int randomNumbersLowerBound = 1;
    private static final int randomNumbersUpperBound = 100;

    private static long maxNumberOfAttempts = Math.round(Math.log(randomNumbersUpperBound) / Math.log(2)); // calculate max number of attempts to guess the number

    public static void main(String[] args) {
        var randomizer = new Random();
        var randomNumber = randomizer.nextInt(randomNumbersLowerBound, randomNumbersUpperBound);
        var numberOfAttempts = 0;
        System.out.println("I've guessed the random number from " + randomNumbersLowerBound + " to " + randomNumbersUpperBound);
        System.out.println("Try to guess it. You have no more than " + maxNumberOfAttempts + " attempts");

        var scanner = new Scanner(System.in);
        while(numberOfAttempts < maxNumberOfAttempts){
            var inputNumber = Integer.parseInt(scanner.nextLine());
            if(inputNumber == randomNumber){
                numberOfAttempts++;
                System.out.println("You've guessed the number in " + numberOfAttempts + " attempts");
                break;
            } else if(randomNumber < inputNumber){
                numberOfAttempts++;
                System.out.println("Oh dear, the right number is less than your input. You have " + (maxNumberOfAttempts - numberOfAttempts) + " attempts left");
            } else{
                numberOfAttempts++;
                System.out.println("Oh dear, the right number is bigger than your input. You have " + (maxNumberOfAttempts - numberOfAttempts) + " attempts left");
            }
        }
        if(numberOfAttempts == maxNumberOfAttempts){
            System.out.println("You've lose. The number was " + randomNumber);
        }
    }
}