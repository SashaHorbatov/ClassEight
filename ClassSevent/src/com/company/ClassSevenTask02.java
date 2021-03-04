package com.company;

import java.util.Arrays;

public class ClassSevenTask02 {
    //2) Найти количество счастливых билетиков
    // на трамвай от 000001 до 999999
    // (те у которых сумма первых 3 цифр равна сумме последних
    public static void main(String[] args) {
        int col=0;
        int[] a = new int[27];
        colHappy();
        System.out.println(Arrays.toString(a));
    }
    private static int colHappy(){
        int col=0;
        int[]a = sumDigit();
        for(int i:a){
            col+=i*i;
        }
        return col;
    }


    //  a[i] - kolichestvo sovpadenij, kogda summa 3 cifr = i+1.
    //  i {1..27} (vozmozhnie varianti summ cifr v chislah 001..999)
    private static int[] sumDigit(){
        int[] a = new int[27];
        for (int i = 1; i <= 999; i++) {
            a[sum(i)-1]++;
        }
        return a;
    }

    //  summa cifr chisla a
    private static int sum(int a) {
        return (a < 10) ? a : (a % 10 + sum(a / 10));
    }
}
