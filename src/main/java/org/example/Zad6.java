package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times?");
        int j = reader.nextInt();

        for(int i=0;i<j;i++){
            printText();
        }
    }

    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
