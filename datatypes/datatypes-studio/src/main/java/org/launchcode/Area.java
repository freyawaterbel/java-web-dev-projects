package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        boolean validNan = Double.isNaN(radius);
        if (validNan || radius <= 0) {
            System.out.println("Please enter a positive number");
        } else {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
        input.close();
    }
}
