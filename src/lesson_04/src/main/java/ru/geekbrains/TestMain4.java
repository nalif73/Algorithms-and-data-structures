package ru.geekbrains;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain4 {

    public static void main(String[] args) {
        testLinkedList();

    }

    private static void testLinkedList() {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);


        linkedList.display();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));

        //       linkedList.removeFirst();
        //      linkedList.remove(2);

        linkedList.display();

        for (Integer value : linkedList) {
            System.out.print(value + " ");
        }

    }


}
