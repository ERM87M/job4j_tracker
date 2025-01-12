package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", 100);
        Book bookOne = new Book("Маленький принц", 200);
        Book bookTwo = new Book("Фауст", 500);
        Book bookThree = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = bookOne;
        books[2] = bookTwo;
        books[3] = bookThree;
        for (int i = 0; i < books.length; i++) {
            Book book1 = books[i];
            System.out.println(book1.getName() + " " + book1.getCount() + " страниц");
        }
        System.out.println("Перестановка книг");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Список книг после перестановки:");
        for (int i = 0; i < books.length; i++) {
            Book book1 = books[i];
            System.out.println(book1.getName() + " " + book1.getCount() + " страниц");
        }
        System.out.println("Книга с названием Clean Code:");
        for (int i = 0; i < books.length; i++) {
            Book book1 = books[i];
            if ("Clean code".equals(book1.getName())) {
                System.out.println(book1.getName() + " " + book1.getCount() + " страниц");
            }
        }
    }
}
