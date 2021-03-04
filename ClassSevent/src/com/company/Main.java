package com.company;

public class Main {
    //1) Электронные часы показывают время в формате от 00:00 до 23:59.
    //Подсчитать сколько раз за сутки случается так,
    // что слева от двоеточия показывается симметричная комбинация для той,
    // что справа от двоеточия (например, 02:20, 11:11 или 15:51).

    public static void main(String[] args) {

        int num = 0;

        for( int i = 0; i <= 23; i++ )
        {

            int h1 = i / 10;
            int h2 = i % 10;

            int min = h2 * 10 + h1;

            if( min >= 0 && min <= 59 )
                num++;
        }

        System.out.println( num );



    }
}
