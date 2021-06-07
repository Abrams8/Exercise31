package com.company;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String a = "aaabbbccc";
        String b = "aaabbbccc";
        for (int i = 0; i < 1000000; i++) {
            a = a + b;
        }
        System.out.println(a);
        long time = System.currentTimeMillis() - start;
        System.out.println("время выполнения в милисекундах = " + time);

        long startSecond = System.currentTimeMillis();
        StringBuilder d = new StringBuilder("aaabbbccc");
        for (int i = 0; i<10000000; i++) {
            d.append("aaabbbccc");
        }
        System.out.println(d);
        long timeSecond = System.currentTimeMillis() - startSecond;
        System.out.println("время выполнения в милисекундах = " + timeSecond);
    }
}
