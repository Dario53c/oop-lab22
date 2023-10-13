package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        printPyramid(5);
        printInversePyramid(10);
    }

    public static void printPyramid(int amount){
      String text = "";
        for(int i=1; i<=amount;i++){
            text = text + "*";
            System.out.println(text);
        }
    }

    public static void printInversePyramid(int amount){
        String text = "";
        for(int i=amount;i>0;i--){
            for(int j=1;j<=i;j++){
                text=text + "*";
            }
            System.out.println(text);
            text = "";
        }
    }
}
