package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

    public static void printStars(int amount){
        String text = "";

        for(int i=0;i<amount;i++){
            text = text + "*";
        }
        System.out.println(text);
    }
}
