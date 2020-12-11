package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat = 11;
        while (mat != 0) {
            System.out.print("Заберите от 1 до 3х спичек, выиигрывает тот, кто заберет последнюю: ");
            int select = Integer.valueOf(input.nextLine());
                mat = mat - select;
                System.out.println("Осталось " + mat + ". Заберите от 1 до 3х спичек:");
            }
            if (mat == 0) {
                System.out.println("Игра завершена.");
            }
        }
    }

