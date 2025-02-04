package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Набирает скорость");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " Тормозит");
    }
}
