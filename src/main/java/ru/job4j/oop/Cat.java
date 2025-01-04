package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println("The cat " + this.name + " was eating " + this.food);
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.giveNick("Barsik");
        barsik.eat("fish");
        barsik.show();

    }
}

