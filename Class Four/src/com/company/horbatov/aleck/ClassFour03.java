package com.company.horbatov.aleck;

import java.util.Scanner;

public class ClassFour03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of approaches");
        int numberOfApproaches = scanner.nextInt();
        int onePullUp = 5;
        double BetweenPullUp = 60;
        double increment = 1.2;

        totalNumberOfRepetitions(numberOfApproaches);

    }

    private static int totalNumberOfRepetitions(int numberOfApproaches) {
        int  totalNumberOfRepetitions = 0;
        for (int i = 0; i <=  numberOfApproaches; i++) {
            totalNumberOfRepetitions += i;
        }
        System.out.println("totalNumberOfRepetitions: " + totalNumberOfRepetitions);
        return totalNumberOfRepetitions;

    }
}
