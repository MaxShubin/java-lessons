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
            if (random.nextInt(2) > 0) {
                arr[i] = arr[i] * (-1);
            }
        }
        System.out.println("Исхoдный массив:");
        System.out.println(Arrays.toString(arr));
        if (arr[0] > 0) {
            System.out.println("Первый элемент массива положительный");
        } else if (arr[0] == 0) {
            System.out.println("Первый элемент массива равен 0");
        } else if (arr[0] < 0) {
            System.out.println("Первый элемент массива отрицательный");
        }
    }
}
