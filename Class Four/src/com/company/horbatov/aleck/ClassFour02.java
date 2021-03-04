package com.company.horbatov.aleck;

import java.util.Scanner;

public class ClassFour02 {
    //2) Попросить пользователя ввести 2 числа.
    //Используя тернарный оператор вывести меньшее из них.

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a < b ? a : b);

    }
}
