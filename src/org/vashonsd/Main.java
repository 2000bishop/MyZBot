package org.vashonsd;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Bot zBot = new Bot();
        Scanner scan = new Scanner(System.in);
        String username = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("cookie.txt"));
            if((username = br.readLine()) == null) {
                System.out.println("What is your name?");
                username = scan.nextLine();
                BufferedWriter bw = new BufferedWriter(new FileWriter("cookie.txt"));
                bw.write(username);
                bw.close();
            } else {
                System.out.println("Welcome back, " + username + "!");
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("you can do: 20 Questions, Make small talk, Training plan, Study . Just type in what you want to do");
        System.out.println("What do you want to do, " + username + "?");
        // Remember the user from before.


        String response = scan.nextLine();;
        zBot.handle(response);
    }
}

