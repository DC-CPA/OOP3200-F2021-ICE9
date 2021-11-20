/**
 * @authors  Katherine Bellman - 100325825
 * @file    OOP3200 - Fall 2021 - Java ICE 9
 * @date    November 15th, 2021
 */

package ca.durhamcollege;

import java.util.Scanner;


//driver class
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String prompt = "";

        Vector2D point1 = new Vector2D();
        System.out.println("Enter the first point (x, y): ");

        prompt = keyboard.nextLine();
        var values = prompt.split(","); // determines what to look for to split the string
        point1.set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));


        System.out.println("--------------------------------------------------------------");
        System.out.println("You Entered" + point1.toString() + " for the first point");
        System.out.println("--------------------------------------------------------------");
        Vector2D point2 = new Vector2D();
        System.out.println("Enter the second point (x, y): ");

        prompt = keyboard.nextLine();
        values = prompt.split(",");
        point2.set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));


        System.out.println("--------------------------------------------------------------");
        System.out.println("You Entered" + point2.toString() + " for the second point");
        System.out.println("--------------------------------------------------------------");

        System.out.printf("Magnitude of first point is: %.3f \n", point1.getMagnitude());
        System.out.printf("Magnitude of second point is: %.3f \n", point2.getMagnitude());
        System.out.printf("Distance between first point and second point is: %.3f \n", Vector2D.distance(point1, point2));
        System.out.println("--------------------------------------------------------------");
    }
}
