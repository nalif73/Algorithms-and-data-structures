package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class BackPack {

    private List<Item> bestItems = null;

    private float maxW;
    private float bestPrice;

    public BackPack(float maxW) {
        this.maxW = maxW;
    }

    //вес предметов
    private float calcWeigth(List<Item> items) {
        float result = 0;
        for (Item item : items) {
            result += item.getWeigth();
        }
        return result;
    }

    // стоимость предметов
    private float calcPrice(List<Item> items) {
        float result = 0;
        for (Item item : items) {
            result += item.getPrice();
        }
        return result;
    }

    //проверка на лучший набор
    private void checkSet(List<Item> items) {
        if (this.bestItems == null) {
            if (this.calcWeigth(items) <= this.maxW) {
                this.bestItems = items;
                this.bestPrice = this.calcPrice(items);
            }
        } else {
            if (this.calcWeigth(items) <= this.maxW && this.calcPrice(items) > this.bestPrice) {
                this.bestItems = items;
                this.bestPrice = this.calcPrice(items);
            }
        }
    }

    //все перестановки значений
    public void makeAllSets(List<Item> items) {
        if (items.size() > 0) {
            this.checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public List<Item> getBestItems() {
        return this.bestItems;
    }

    }

