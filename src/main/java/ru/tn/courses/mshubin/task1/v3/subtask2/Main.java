package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество точек на передних гранях кубиков");
        int cube1 = 0;
        int cube2 = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        try {
            cube1 = scanner.nextInt();
            while (cube1 < 1 || cube1 > 6) {
                System.out.println("Введите число от 1 до 6 ");
                cube1 = scanner.nextInt();
            }
            cube2 = scanner.nextInt();
            while (cube2 < 1 || cube2 > 6) {
                System.out.println("Введите число от 1 до 6 ");
                cube2 = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            System.exit(0);
        }

        if (cube1 + cube2 < 4 || cube1 + cube2 >= 10) {
            System.out.println(cube1 + " " + cube2 + " cube3" + " cube4");
        } else {
            System.out.println(cube1 + " " + cube2 + " cube3");
        }
        if (cube1 + cube2 >= 4 && cube1 + cube2 <= 9) {
            System.out.println("Количество точек на 3 кубе для открытия двери = " + (10 - (cube1 + cube2)));
        } else if (cube1 + cube2 > 9) {
            int ost = 10 - cube2; //4,5,6
            int cube3 = random.nextInt(ost - 1) + 1;
            int cube4 = 10 - (cube2 + cube3);
            System.out.println("Для того, чтобы открыть дверь нужно вставить кубы с точками: " + cube3 + " " + cube4);
        } else if (cube1 + cube2 < 4) {
            int cube3 = random.nextInt(4) + 3;
            int cube4 = 10 - (cube2 + cube3);
            System.out.println("Для того, чтобы открыть дверь нужно вставить кубы с точками: " + cube3 + " " + cube4);
        }
    }
}