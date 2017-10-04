package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Enter your first name.");
        String fName= userInput.nextLine();
        System.out.println("Enter your last name.");
        String lName = userInput.nextLine();
        String name = fName + " " + lName;
        System.out.println("Enter your balance.");
        double balance = userInput.nextDouble();


    }
}
