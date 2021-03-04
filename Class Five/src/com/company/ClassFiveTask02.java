package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ClassFiveTask02 {
    //2) В метод передается массив и 2 числа a,b;
    //Напечатать числа с индексами от a,b или напечатать что индексы недопустимы.
    //Пример: {5,3,2,6,7}, a=1, b=3, результат: [3,2,6]
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length");
        int[] arr = new int[(scanner.nextInt())];
        System.out.println("Enter start length of range");
        int start = scanner.nextInt();
        System.out.println("Enter end length of range");
        int end = scanner.nextInt();
        setArray(arr);


        printRange(arr, start, end);
    }

    private static void setArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
    }

    private static void printRange(int[] arr, int start, int end) {
        if (start > end && start < 0 || end > arr.length || start > end) {
            System.out.println("Indices are not valid");
            return;
        }
        int[] destination = new int[end - start];
        System.arraycopy(arr, start, destination, 0, end - start);
        System.out.println(Arrays.toString(destination));
    }
}
