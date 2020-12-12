package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        Boolean player1 = true;
        String username = "Первый игрок";
        while (matches > 0) {
            if (player1)
                System.out.println(username);
            else {
                System.out.println("Второй игрок, ");
            }
            System.out.print("заберите от 1 до 3х спичек, выиигрывает тот, кто заберет последнюю: ");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Вы выбрали неверное количество");
            } else {
                matches = matches - select;
                if (matches > 0) {
                    player1 = !player1;
                    System.out.println("Осталось " + matches);
                } else
                    System.out.println("Осталось 0 спичек. " + username + "," + " Вы выйграли!");
            }
        }
    }
}



