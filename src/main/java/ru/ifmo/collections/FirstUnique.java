package ru.ifmo.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Design a class which contains integers and returns first unique integer (in order of addition).
 * FirstUniqueTest can be used as an example.
 */
public class FirstUnique {
    private LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();

    public FirstUnique(int[] numbers) {
        for (int number : numbers) {
            this.add(number);
        }
    }

    public int showFirstUnique() {
        for (Map.Entry<Integer, Boolean> item : map.entrySet()) {
            if (item.getValue()) {
                return item.getKey();
            }
        }
        return -1;
    }

    public void add(int value) {
        this.map.put(value, this.map.get(value) == null);
    }
}
