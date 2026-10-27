package com.pluralsight;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        //variable to track if the app is running
        boolean appRunning = true;
        while(appRunning) {
            try {
                //create scanner
                Scanner scanner = new Scanner(System.in);

                //arraylist of quotes
                ArrayList<String> quotes = new ArrayList<>();

                //quotes
                quotes.add("Hard work is worthless for those that don’t believe in themselves."); // Naruto
                quotes.add("When people get hurt, they learn to hate, but if you learn to forgive, you can learn to love again."); // Jiraiya
                quotes.add("I’m not gonna run away. I never go back on my word."); // Naruto
                quotes.add("Feel the rage. Feel the hatred. But do not let it consume you."); // Tanjiro
                quotes.add("No matter how many people you lose, you have no choice but to go on living."); // Demon Slayer

                //ask user for which number they want for quote
                System.out.println("Enter a number (quotes) 1 - 5: ");
                System.out.println("press 0 to exit: ");
                int index = scanner.nextInt();

                if(index <= 0 ){
                    appRunning = false;

                }

                System.out.println("You're quote: " + quotes.get(--index));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Sorry the number is invalid");
            }
        }
    }
}
