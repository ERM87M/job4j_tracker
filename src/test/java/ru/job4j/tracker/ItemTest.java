package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemSortTest {

    @Test
    void whenSortByNameAsc() {
        List<Item> items = Arrays.asList(
                new Item(1, "Chit"),
                new Item(2, "All"),
                new Item(3, "Brat")
        );

        List<Item> expected = Arrays.asList(
                new Item(2, "All"),
                new Item(3, "Brat"),
                new Item(1, "Chit")
        );

        Collections.sort(items, new ItemAscByName());
        assertEquals(expected.toString(), items.toString());
    }

    @Test
    void whenSortByNameDesc() {
        List<Item> items = Arrays.asList(
                new Item(1, "Chit"),
                new Item(2, "All"),
                new Item(3, "Brat")
        );

        List<Item> expected = Arrays.asList(
                new Item(1, "Chit"),
                new Item(3, "Brat"),
                new Item(2, "All")
        );

        Collections.sort(items, new ItemDescByName());
        assertEquals(expected.toString(), items.toString());
    }
}