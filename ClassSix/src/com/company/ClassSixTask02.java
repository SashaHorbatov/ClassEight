package com.company;

public class ClassSixTask02 {
    //2) Использя оператор "..." написать метод который выводит максимальное значение из переданных

    public static void main(String[] args) {
        int maxRes = findMaximumValue(13, 23, 30, 45, 56, 67, 78);
        System.out.println("Maxsimum value: " + maxRes);

    }

    private static int findMaximumValue(int... myArray) {

        int maxResult = myArray[0];

        for (int num : myArray) {
            if (num > maxResult) {
                maxResult = num;
            }
        }
        return maxResult;
    }
}

