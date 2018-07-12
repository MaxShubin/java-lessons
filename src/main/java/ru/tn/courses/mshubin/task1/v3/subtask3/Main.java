package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int swap = 0;
        System.out.println("Введите количество элементов массива:");
        size = scanner.nextInt();
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
            if (random.nextInt(2) > 0) {
                arr[i] = arr[i] * (-1);
            }
        }
        System.out.println("Исходный массив: \n" + Arrays.toString(arr));
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    int IIIOPA = arr[j];
                    arr[j] = arr[i];
                    arr[i] = IIIOPA;
                    swap++;
                }
            }
        }
        System.out.println("Отсортированный массив: \n" + Arrays.toString(arr) + "\nКоличество перестановок: " + swap);
    }
}