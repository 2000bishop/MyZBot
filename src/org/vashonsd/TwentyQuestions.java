package org.vashonsd;

import java.util.Random;
import java.util.Scanner;

public class TwentyQuestions extends Minigame{
    public TwentyQuestions() {
        super("20Q", "Play 20 questions against the computer");
    }



    @Override
    public void play() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Now playing 20 questions.");
        int trysLeft = 20;
        int secretNum = rand.nextInt(100);
        int userResponse = 0;
        while(userResponse != secretNum && trysLeft > 0) {
            System.out.print("guess number between 1 and 100:  ");
            userResponse = scan.nextInt();
            if (userResponse == secretNum) {
                System.out.println("Hooray! You got it in " + (20-trysLeft) + " guesses!");
                break;
            }
            trysLeft--;
            if (userResponse > secretNum) {
                System.out.println("No the ancer is less");
            }
            if (userResponse < secretNum) {
                System.out.println("No the ancer is more");
            }
            System.out.println("you have: " + trysLeft + " trys left");
        }
        if(trysLeft == 0) {
            System.out.println("Sorry, looks like you ran out of guesses.");
        }


//        return 4.0;
    }
}
