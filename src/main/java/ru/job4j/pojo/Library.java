package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book macbeth = new Book("Macbeth", 430);
        Book theAdventureOfTheEmptyHouse = new Book("The Adventure of the Empty House", 400);
        Book theManInTheBrownSuit = new Book("The Man in the Brown Suit", 300);
        Book cleanCode = new Book("Clean code", 200);
        Book[] books = new Book[4];
        books[0] = macbeth;
        books[1] = theAdventureOfTheEmptyHouse;
        books[2] = theManInTheBrownSuit;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("Replace Macbeth to Clean code.");
        //Book oil = new Book("Oil", 11);
        books[0] = cleanCode;
        books[3] = macbeth;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + " - " + pr.getPages());
        }
        System.out.println("Shown only Clean code");
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            if (pr.getName().equals("Clean code")) {
                System.out.println(pr.getName() + " - " + pr.getPages());
            }
        }
    }
}
