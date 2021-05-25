package ru.geekbrains.lesson_02;

import java.util.concurrent.TimeUnit;

public class TestDynamicArray {

    public static void main(String[] args) {

        int min = 0, max = 100001, size = 100000;
        long start, finish;

        Array<Integer> data1 = new ArrayImpl<>(size);
        Array<Integer> data2 = new ArrayImpl<>(size);
        Array<Integer> data3 = new ArrayImpl<>(size);

        for (int i = 0; i < size; i++) {
            int tmp = getRandomNumber(min, max);
            data1.add(tmp);
            data2.add(tmp);
            data3.add(tmp);
        }

        System.out.println("sortBubble()");
        start = System.nanoTime();
        data1.sortBubble();
        finish = System.nanoTime();
        System.out.println(TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " сек");
        System.out.println("-------");

        System.out.println("sortSelect()");
        start = System.nanoTime();
        data1.sortSelect();
        finish = System.nanoTime();
        System.out.println(TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " сек");
        System.out.println("-------");

        System.out.println("sortInsert()");
        start = System.nanoTime();
        data1.sortInsert();
        finish = System.nanoTime();
        System.out.println(TimeUnit.SECONDS.convert(finish - start, TimeUnit.NANOSECONDS) + " сек");
        System.out.println("-------");

    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
