package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        boolean run = true;
        Scanner input = new Scanner(System.in);
        int matches = 11;
        while (run) {
            System.out.print("Заберите от 1 до 3х спичек, выиигрывает тот, кто заберет последнюю: ");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Вы выбрали неверное количество");
            } else if (select > 0 || select <= 3) {
                matches = matches - select;
                System.out.println("Осталось " + matches + ". Заберите от 1 до 3х спичек:");
            }
            if (matches == 0) {
                run = false;
                System.out.println("Осталось 0 спичек, Вы выйграли!");
            }
        }
    }
}

