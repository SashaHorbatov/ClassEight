package com.company.horbatov.aleck;

import java.util.Scanner;

public class ClassFour01 {
    /* 1) Оператор swtich-case:
    Пользователь вводит целое число - код ошибки.
    Если 200, 201, 202 или 204 вывести - Success
    Если 301 или 302 - Redirection
    Если 400, 401 или 404 - Client Error
    Если 500, 502, 503 или 504 - Server Error*/

    public static void main(String[] args) {
        System.out.println("Enter integer");
        Scanner scanner = new Scanner(System.in);
        int codeError = scanner.nextInt();
        switch (codeError) {
            case 200, 201, 202, 204:
                System.out.println("Success");
                break;
            case 301, 302:
                System.out.println("Redirection");
                break;
            case 400, 401, 404:
                System.out.println("Client Error");
                break;
            case 500, 502, 503, 504:
                System.out.println(" Server Error");
                break;
            default:
                System.out.println(" Error");
        }
    }
}
