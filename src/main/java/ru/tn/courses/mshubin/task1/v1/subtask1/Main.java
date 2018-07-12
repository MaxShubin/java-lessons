package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        System.out.println("Введите количество элементов массива");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Введите число К");
        int k = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print((arr[i]));
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % k == 0) {
                sum = sum + arr[i];
            }
        }

        if (sum == 0) {
            System.out.println("Нет эллементов кратных" + k);
        } else {
            System.out.println();
            System.out.println("Сумма элементов кратных " + k + "-ем " + "= " + sum);
        }
    }
}