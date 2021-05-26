package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int euro = scanner.nextInt();
	int vrienden = scanner.nextInt();

	int modulo = (euro % vrienden);

	if (modulo == 0) {
        System.out.println("Ja!");
    }
	else {

        System.out.println("nee");


    }

    }
}
