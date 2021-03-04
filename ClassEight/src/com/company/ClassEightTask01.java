package com.company;

import java.util.Scanner;

public class ClassEightTask01 {
    //1) банк положили S денег. Какой станет сумма вклада через N лет,
    // если процент 1,5% добавляется к сумме вклада ежемесячно.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of money");
        float startSum = scanner.nextInt();
        System.out.println("Enter amount of year");
        int period = scanner.nextInt();
        double interestRate = 0.015;

        for (int i = 1; i <= period * 12; i++) {
            startSum += startSum * 0.015;
        }
        System.out.println("Your future amount will be: " + startSum);
    }


}
