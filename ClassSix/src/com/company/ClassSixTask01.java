package com.company;

import java.util.Formatter;

public class ClassSixTask01 {
    //1) Продемонстрировать работу перечисленных методов string:
    //charAt,     contains, endsWith, startsWith, equals,    equalsIgnoreCase,
    //format,    indexOf,   isEmpty, length, replace,  substring,
    // toLowerCase,   toUpperCase, trim
    //*valueOf
    //*split

    public static void main(String[] args) {
        String s = "Test method";
        char result1 = s.charAt(5);
        System.out.println("Five character of the string - " + result1);

        System.out.println("Contains sequence 'Test': " + s.contains("Test"));

        System.out.println("Start character of the string:" + s.startsWith("Tes"));
        System.out.println("End character of the string:" + s.endsWith("Od"));

        String s1 = "I will become a good programmer";
        String s2 = "I will become a good programmer";
        System.out.println("Strings equals" + s1.equals(s2));

        String address1 = "Kharkov, village Kobzarivka street World 14";
        String address2 = "kHARKOV, VILLAGE KOBZARIVKA STREET WORLD 14";
        System.out.println("String also equals: " + address1.equalsIgnoreCase(address2));
        Formatter f = new Formatter();
        f.format("This %s is about %n%S %n", "book", "java", '6');
        System.out.println(f);

        int d;
        d = s.indexOf("thod");
        d = s.indexOf("abs");
        System.out.println("Method indexOf: " + s.indexOf("thod"));
        System.out.println("Method indexOf: " + s.indexOf("abs"));

        boolean b;
        b = s.isEmpty();
        s = "";
        b = s.isEmpty();
        System.out.println("Method isEmpty: " + s.isEmpty());

        String Str1 = new String("Welcome to Java");
        System.out.println("Length string: \" Welcome to Java\" - ");
        System.out.println(Str1.length());

        String n, b2;
        n = "JavaMethod";
        b2 = n.replace('J', 'M');
        System.out.println("Symbol replacement: " + n.replace('J', 'M'));

        String h, h2;
        h = "This is a text";
        h2 = h.substring(3);
        System.out.println("Method substring: " + h.substring(3));

        String j1;
        String j2;
        j1 = "Java Super";
        j2 = j1.toLowerCase();
        j2 = j1.toLowerCase();
        System.out.println("Method toLowerCase: " + j1.toLowerCase());
        System.out.println("Method toLowerCase: " + j1.toUpperCase());

        String stri = new String("Welcome to Java");
        System.out.print("Return value method trim: ");
        System.out.println(Str1.trim());

        String k;
        double l;
        l = 3.14;
        k = String.valueOf(l);
        System.out.println("Method valueOf: " + String.valueOf(l));

    }

}

