package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int first;
    int last;

        System.out.print("First: ");
        first = reader.nextInt();

        System.out.print("Last: ");
        last = reader.nextInt();

        if(first<last){
            for(int i=first ;i<=last;i++){
                System.out.println(i);
            }
        }

    }
}
