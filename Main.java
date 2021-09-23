package ru.vsu.cs.suvorov_d_a;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        double side_a = readNumber("side_'a'");
        double side_b = readNumber("side_'b'");
        double hypotenuse = findHypotenuse(side_a, side_b);
        double area = findArea(side_a, side_b);
        double perimeter = findPerimeter(side_a, side_b, hypotenuse);

        printAnswer(area, perimeter);

    }

    private static double readNumber(String nameSide) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the length of the %s:", nameSide);
        double value = scanner.nextDouble();

        if (value<=0) {
            System.out.printf("Error. Length of the %s can be only more than 0", nameSide);
            System.exit(0);
        }
        return value;
    }

    private static double findHypotenuse (double side_a, double side_b) {
        return Math.sqrt(side_a * side_a + side_b * side_b);
    }

    private static double findArea (double side_a, double side_b) {
        return (0.5* side_a * side_b);
    }

    private static double findPerimeter (double side_a, double side_b, double side_c) {
        return (side_a + side_b + side_c);
    }

    private static void printAnswer (double area, double perimeter) {
        System.out.println ("Area of a triangle = " + area);
        System.out.println ("Perimeter of a triangle = " + perimeter);
    }
}