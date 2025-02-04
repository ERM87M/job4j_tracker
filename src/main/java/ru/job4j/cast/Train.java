package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Набирает ход");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " Сбавляет ход");
    }
}
