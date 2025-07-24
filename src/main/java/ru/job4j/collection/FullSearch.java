package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> listing = new HashSet<>();
        for (Task task : tasks) {
            listing.add(task.getNumber());
        }
        return listing;
    }
}
