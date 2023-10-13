package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type the first number:");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number:");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number:");
        sum = sum + Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + sum);
    }
}
