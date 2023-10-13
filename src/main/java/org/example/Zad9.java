package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        drawNumbersPyramid(5);
        drawNumbersPyramid1(5);
    }

    public static void drawNumbersPyramid(int amount){
        String text = "";
        for(int i=1; i<=amount;i++){
            text = text + i;
            System.out.println(text);
        }
    }

    public static void drawNumbersPyramid1(int amount){
        String text = "";
        for(int i=1;i<=amount;i++){
            for(int j=1;j<=i;j++){
                text=text + i;
            }
            System.out.println(text);
            text = "";
        }
    }
}
