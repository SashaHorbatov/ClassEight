package com.company;


import java.util.Random;

public class ClassFiveTask01 {
    //1) Подсчитать вероятность при помощи Random и большого количество повторений:
    //- сумма значиний при броске 2 кубиков равна 7
    //- на всех 3 кубиках значения разные
    //- на 3 монетках выпало одна сторона

    private static Random random = new Random();
    private static int maxValue = 100000;

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < maxValue; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 + dice2 == 7) {
                count++;
            }
        }
        System.out.println((double) count * 100 / maxValue + " %");
        int count2 = 0;
        for (int i = 0; i < maxValue; i++) {
            int diceOne = dice();
            int diceTwo = dice();
            int diceThree = dice();
            if (diceOne != diceTwo && diceTwo != diceThree && diceThree != diceOne) {
                count2++;
            }
        }
        System.out.println("probability of three different dice: " + (double) count2 * 100 / maxValue + " %");
        int count3 = 0;
        for (int i = 0; i < maxValue; i++) {
            int coin1 = coinToss();
            int coin2 = coinToss();
            int coin3 = coinToss();
            if (coin1 == coin2 && coin2 == coin3 && coin3 == coin1) {
                count3++;
            }
        }
        System.out.println("Probability of three identical sides of coins: " + (double) count3 * 100 / maxValue + "%");
    }

    private static int dice() {
        return random.nextInt(6) + 1;
    }

    private static int coinToss() {
        return random.nextInt(2) + 1;
    }

}
