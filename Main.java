package ru.vsu.cs.suvorov_d_a;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        double Side_a = readLength();
        double Side_b = readWidth();
        printAnswer(findArea(Side_a, Side_b), findPerimeter(Side_a, Side_b, findHypotenuse(Side_a, Side_b)));

    }

    private static double readLength() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the side 'a': ");
        double Side_a = scan.nextDouble();

        if (Side_a < 0) {
            System.out.println("Error. Length can be only more than 0");
            System.exit(0);
        }

        return Side_a;
    }

    private static double readWidth() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the side 'b': ");
        double Side_b = scan.nextDouble();

        if (Side_b < 0) {
            System.out.println("Error. Length can be only more than 0");
            System.exit(0);
        }

        return Side_b;
    }

    private static double findHypotenuse (double Side_a, double Side_b) {
        return Math.sqrt(Side_a*Side_a + Side_b*Side_b);
    }

    private static double findArea (double Side_a, double Side_b) {
        return (0.5*Side_a*Side_b);
    }

    private static double findPerimeter (double Side_a, double Side_b, double Side_c) {
        return (Side_a + Side_b + Side_c);
    }

    private static void printAnswer (double Area, double Perimeter) {
        System.out.println ("Area of a triangle = " + Area);
        System.out.println ("Perimeter of a triangle = " + Perimeter);
    }
}