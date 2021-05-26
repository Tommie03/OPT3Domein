package com.company;

import java.util.Scanner;

public class IfElseVoorbeeld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een getal in:");
        int getal = scanner.nextInt();

        if (getal > 0 && getal < 10) {
            System.out.println(getal);
        }
        else System.out.println("Fout, voer een getal in tussen 1 en 10");










    }
}
