package org.example;
import java.util.Objects;
import java.util.Scanner;


public class Zad3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while(true){
            int read = Integer.parseInt(reader.nextLine());

            if(read==0){
                break;
            }
            sum = sum + read;

            System.out.println("Sum: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
    }
}
