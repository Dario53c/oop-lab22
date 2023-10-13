package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;

        System.out.print("Type a number:");
        int exponent = reader.nextInt();
        result = (int)Math.pow(2, exponent);
        System.out.println("The result is " + result);
    }
}
