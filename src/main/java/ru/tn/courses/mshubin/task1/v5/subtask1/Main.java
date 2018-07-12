package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        int size2 = 0;
        System.out.println("Введите количество элементов массива:");
        size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        Random random = new Random();
        for (int i = 0; i < size1; i++) {
            arr1[i] = random.nextInt(10);
            if (arr1[i] % 2 == 0) size2++;
        }

        System.out.println("Исходный массив: \n" + Arrays.toString(arr1));
        if (size2 == 0) {
            System.out.println("Нет четныйх элементов");
            System.exit(0);
        }

        int[] arr2 = new int[size2];
        int counter = 0;
        for (int i = 0; i < size1; i++) {
            if (arr1[i] % 2 == 0 && arr1[i] != 0) {
                arr2[counter] = arr1[i];
                counter++;
            }
        }
        System.out.println("Конечный массив: \n" + Arrays.toString(arr2));
    }
}