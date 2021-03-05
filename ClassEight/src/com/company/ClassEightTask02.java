package com.company;

public class ClassEightTask02 {
    /* 2) Вывести в 1 строку через пробел все числа от 1 до 99
    со следующими изменениями:
     - если число кратно 3 то вывести вместо него Hello
     - если число кратно 5 то вывести вместо него World
     - если число кратно и 3 и 5 то вывести вместо него HelloWorld*/
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("HelloWorld");
            } else if (i % 3 == 0) {
                System.out.println("Hello");
            } else if (i % 5 == 0) {
                System.out.println("World");
            } else {
                System.out.println(i + "");
            }
        }
    }
}
