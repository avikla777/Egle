package edu.jcourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your tree size > ");
        int size = scanner.nextInt();

        int lines = (size + 1) / 2;



        for (int i = 0; i < lines; i++) {
            int spaces = (lines - i) -1;
            int stars = (i*2)+1;
//            for (int s = 0; s < spaces; s++) {
//                System.out.print(" ");
//            }
//            for (int x = 0; x < stars; x++) {
//                System.out.print("*");
//            }
//            System.out.println();
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));



        }


    }

}
