package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Транспорт начинает свой маршрут");
    }

    public void passengers(int count) {
        System.out.println("пассажиров" + count);
    }

    public int refuel(int fuel) {
        return fuel * 100;
    }
}
