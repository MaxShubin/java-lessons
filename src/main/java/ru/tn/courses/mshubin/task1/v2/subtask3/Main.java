package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Введите количество элементов массива:");
        size = scanner.nextInt();
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println("Исхoдный массив: \n" + Arrays.toString(arr));
        for (int i = 0; i < size; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int d = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = d;
            }
        }

        System.out.println("Готовый массив: \n" + Arrays.toString(arr));
    }
}