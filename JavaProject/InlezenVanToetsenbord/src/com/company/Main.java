package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println ("Geef je naam:");
	String naam = scanner.nextLine ();
	System.out.println ("Geef je leeftijd");
	int leeftijd = scanner.nextInt ();
	System.out.println  ("Je heet");
	System.out.println  (naam);
	System.out.println  ("Je bent");
	System.out.println  (leeftijd);
	System.out.println  ("Jaar oud");
    }
}
