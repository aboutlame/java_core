package ru.mentee.power.branchingoperators;

import java.util.Scanner;

public class DriverLicense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you have driver's license (y/n): ");
        String driverlicense = scanner.nextLine();
        boolean isdriverlicense = driverlicense.equals("y");

        if (age >= 18 && isdriverlicense){
            System.out.println("Congratulations! You can drive the car");
        }
        else{
            System.out.println("Sorry, you can't drive the car");
        }
    }
}
