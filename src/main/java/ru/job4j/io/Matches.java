package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean player1 = true;
        String username = " ";
        while (matches > 0) {
            username = player1 ? "Первый игрок" : "Второй игрок";
            System.out.println("Ход совершает: " + username);
            System.out.print("заберите от 1 до 3х спичек, выигрывает тот, кто заберет последню: ");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Вы выбрали неверное количество");
            } else {
                matches = matches - select;
                if (matches > 0) {
                    player1 = !player1;
                    System.out.println("Осталось " + matches);
                }
            }
        }
        System.out.println("Осталось 0 спичек. " + username + "," + " Вы выиграли!");
    }
}

