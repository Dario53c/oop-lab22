package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String password = "black";

        while(true){
            System.out.println("Please enter the password:");
            String attempt = reader.nextLine();
            if(Objects.equals(attempt, password)){
                System.out.println("Correct!");
                break;
            }else{
                System.out.println("False!");
            }
        }

    }
}