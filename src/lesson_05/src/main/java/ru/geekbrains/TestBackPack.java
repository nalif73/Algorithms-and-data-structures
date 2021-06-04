package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;


public class TestBackPack {
    public static void main(String[] args) {


        List<Item> items = new ArrayList<>();
        items.add(new Item("Телефон", 1, 6000));
        items.add(new Item("Рация", 2, 8300));
        items.add(new Item("Спальник", 4, 1500));
        items.add(new Item("Вода", 4, 300));
        items.add(new Item("Плитка-газ", 1, 1800));

        BackPack backpack = new BackPack(8);
        backpack.makeAllSets(items);
        System.out.println("В наличии");
        System.out.println(items);
        System.out.println("Берем в рюкзак");
        System.out.println(backpack.getBestItems());

    }

}
