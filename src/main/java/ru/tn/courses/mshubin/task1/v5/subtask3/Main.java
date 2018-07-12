package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int p;
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
        System.out.println("Изначальный массив: \n" + Arrays.toString(arr));

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int el = arr[i];
                for (p = i; p >= gap && arr[p - gap] > el; p = p - gap) {
                    arr[p] = arr[p - gap];
                }
                arr[p] = el;
            }
        }
        System.out.println("Отсортированный массив: \n" + Arrays.toString(arr));
    }
}
