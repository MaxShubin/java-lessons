package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size1;
        int size2;
        System.out.println("Введите количество элементов 1-ого массива");
        Scanner scanner = new Scanner(System.in);
        size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Введите элемент 1-ого массива");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Введите количество элементов 2-ого массива");
        size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Введите элемент  2-ого массива");
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int i = arr2.length; i < arr1.length; i++) {
            arr1[i] = arr2[i - arr2.length];
        }

        Arrays.sort(arr1);
        System.out.println("Новая последовательность: \n" + Arrays.toString(arr1));
    }
}
