package org.example;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Zad10 {

    public static void main(String[] args) {
        int number = drawNumber();
        int guess=0;

        attemptTester(number, guess);
    }

    public static int drawNumber(){
        Random rand = new Random();

        return rand.nextInt(101);
    }

    public static void attemptTester(int number, int guess){
        Scanner reader = new Scanner(System.in);
        int attempts = 0;
        while(true){
            System.out.print("Guess the number:");
            guess = reader.nextInt();

            if(Objects.equals(guess, number)){
                System.out.println("Congratulations, Your guess is correct!");
                break;
            } else if (guess<number) {
                System.out.println("The number is greater, guesses made : " + ++attempts);
            }else{
                System.out.println("The number is lesser, guesses made : " + ++attempts);
            }
        }
    }
}
