package org.vashonsd;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;

public class Bot {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);


//    {
//
//        try {
//         //   System.out.println("have you loged in befor?");
//         //   String logIn = scan.newline();
//          //  if (logIn.equals("yes")) {
//            System.out.println("how is it");
//            String hello = scan.nextLine();
//            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//         //   }
////            writer.write("Now writing");
////            writer.close();
//            String line;
//            System.out.println("is your name " + (line = reader.readLine()) + " ?" );
//            String userResponce = scan.nextLine();
//            if (userResponce.equals("no") ) {
//
//                System.out.println("Ok what is your name realy? ");
//                String userName = scan.nextLine();
//                System.out.println(userName);
//                writer.write(userName);
//            }
//            else {
//                System.out.println("ok good");
//            }
//
//
//
////            while((line = reader.readLine()) != null) {
////                System.out.println(line);
////            }
//            writer.close();
//            System.out.println(reader.readLine());
//            reader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }


  //  userResponse =
    public Bot()
    {

    }

    public void handle(String whatToDo)
    {
        if(whatToDo.equals("20 Questions"))
        {
            System.out.println("Starting 20 questions...");
            this.questions();
        }
        else if(whatToDo.equals("Make small talk"))
        {
            System.out.println("Ok lets talk...");
            this.smallTalk();
        }
        else if(whatToDo.equals("Training plan"))
        {
            System.out.println("Starting training plan");
            this.training();
        }
        else if(whatToDo.equals("Study"))
        {
            System.out.println("Starting study session");
            this.study();
        }
        else
        {
            System.out.println("I don't understand");
        }
    }

    public double questions()
    {
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


        return 4.0;
    }

    public void smallTalk(){
        System.out.println("what is your favorite food?");
       String userResponse = scan.nextLine();
       System.out.print("I like " + (userResponse) + " to.");
    }
    public void training (){
        System.out.println("what is your running goal for this week?");
        int milesGoal = scan.nextInt();
        System.out.println("what was your running distance in miles  today?");
        int milesRun = scan.nextInt();
        int milesNeed = milesGoal - milesRun  ;
        System.out.print(" if you ran " + (milesRun) + " miles today then you need to run " + (milesNeed) + " more miles");
    }
    public void study (){
        int questonsRight = 0;
        int questonsWrong = 0;

        System.out.println("What is the square root of 5?");
        int answer = scan.nextInt();
        if (answer == 25) {
            System.out.println("Correct!");
            questonsRight ++;
        }
        else
        {
            System.out.println("Wrong");
            questonsWrong ++;
        }
        System.out.println("What is 500*6?");
        int answerTwo = scan.nextInt();
        if (answerTwo == 3000) {
            System.out.println("Correct!");
            questonsRight ++;
        }
        else
        {
            System.out.println("Wrong!");
            questonsWrong ++;
        }

        System.out.println("Here is you total:");
        System.out.println("you got " + (questonsRight) + " Right");
        System.out.println("you got " + (questonsWrong) + " Wrong");
    }
    public void nothing(){
    }
}